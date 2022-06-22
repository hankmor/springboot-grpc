package com.belonk.server;

import com.belonk.service.ArithService;
import io.grpc.Server;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by sun on 2022/6/22.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
@Component
public class GrpcServer {
	//~ Static fields/constants/initializer

	private static final Logger log = LoggerFactory.getLogger(GrpcServer.class);

	//~ Instance fields

	private Server server;
	@Value("${rpc.port}")
	private int rpcPort;

	//~ Constructors


	//~ Methods

	public void start() throws Exception {
		this.server = io.grpc.ServerBuilder.forPort(rpcPort).addService(new ArithService()).build().start();

		// 添加关闭服务器的回调，将server(socket)关闭掉...
		Runtime.getRuntime().addShutdownHook(new Thread(this::stop));
		log.info("rpc server started on port: {}", rpcPort);

		this.server.awaitTermination();
	}

	public void stop() {
		if (this.server != null) {
			log.info("rpc server shutdown...");
			this.server.shutdown();
		}
	}
}
