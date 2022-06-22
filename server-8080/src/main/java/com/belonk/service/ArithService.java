package com.belonk.service;

import com.belonk.proto.ArithGrpc;
import com.belonk.proto.Int;
import com.belonk.proto.Param;
import com.belonk.proto.Quotient;
import io.grpc.stub.StreamObserver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by sun on 2022/6/21.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
public class ArithService extends ArithGrpc.ArithImplBase {
	//~ Static fields/constants/initializer

	private static final Logger log = LoggerFactory.getLogger(ArithService.class);

	//~ Instance fields

	@Override
	public void multiply(Param param, StreamObserver<Int> responseObserver) {
		log.info("multiply: a - {}, b - {}", param.getA(), param.getB());

		Int ret = Int.newBuilder().setRet(param.getA() * param.getB()).build();
		responseObserver.onNext(ret);
		responseObserver.onCompleted(); // 调用完成
	}

	@Override
	public void divide(Param param, StreamObserver<Quotient> responseObserver) {
		log.info("divide: a - {}, b - {}", param.getA(), param.getB());
		if (param.getB() == 0) {
			responseObserver.onError(new ArithmeticException("by zero"));
			return;
		}
		int quo = param.getA() / param.getB();
		int mod = param.getA() % param.getB();
		Quotient q = Quotient.newBuilder().setQuo(quo).setRem(mod).build();
		responseObserver.onNext(q);
		responseObserver.onCompleted(); // 调用完成
	}

	//~ Constructors


	//~ Methods


}
