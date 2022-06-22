package com.belonk.controller;

import com.belonk.proto.ArithGrpc;
import com.belonk.proto.Int;
import com.belonk.proto.Param;
import com.belonk.proto.Quotient;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by sun on 2022/6/21.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
@RestController
@RequestMapping("/arith")
public class ArithController {
	//~ Static fields/constants/initializer

	private static final Logger log = LoggerFactory.getLogger(ArithController.class);

	//~ Instance fields

	@Value("${rpc.host}")
	private String rpcHost;
	@Value("${rpc.port}")
	private int rpcPort;

	private ManagedChannel channel;

	//~ Constructors


	//~ Methods

	@InitBinder
	public void init() {
		channel = connectToRpc();
	}

	@GetMapping("/m")
	public int multiply(int a, int b) {
		// 阻塞请求
		ArithGrpc.ArithBlockingStub arithBlockingStub = ArithGrpc.newBlockingStub(channel);
		Int ret = arithBlockingStub.multiply(Param.newBuilder().setA(a).setB(b).build());
		return ret.getRet();
	}

	@GetMapping("/d")
	public void divide(int a, int b) {
		Param p = Param.newBuilder().setA(a).setB(b).build();
		ArithGrpc.ArithStub arithStub = ArithGrpc.newStub(channel);
		arithStub.divide(p, new StreamObserver<Quotient>() {
			@Override
			public void onNext(Quotient quotient) {
				log.info("{} divide {} success: quotient = {}, remain = {}", a, b, quotient.getQuo(), quotient.getRem());
			}

			@Override
			public void onError(Throwable throwable) {
				log.error("{} divide {} error: {}", a, b, throwable);
			}

			@Override
			public void onCompleted() {
				log.info("{} divide {} completed", a, b);
			}
		});
	}

	public ManagedChannel connectToRpc() {
		return ManagedChannelBuilder.forAddress(rpcHost, rpcPort).usePlaintext().build();
	}
}
