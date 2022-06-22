package com.belonk.service;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

import java.io.IOException;
import java.util.Map;

/**
 * Created by sun on 2022/6/21.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
public class ServiceManager {
	//~ Static fields/constants/initializer


	//~ Instance fields


	//~ Constructors


	//~ Methods

	private Server server;
	private static final int grpcServerPort = 9091;

	public void loadService(Map<String, Object> grpcServiceBeanMap) throws IOException, InterruptedException {
		ServerBuilder serverBuilder = ServerBuilder.forPort(grpcServerPort);
		// 采用注解扫描方式，添加服务
		for (Object bean : grpcServiceBeanMap.values()) {
			serverBuilder.addService((BindableService) bean);
			System.out.println(bean.getClass().getSimpleName() + " is registered in Spring Boot！");

		}
		server = serverBuilder.build().start();

		System.out.println("grpc server is started at " + grpcServerPort);

		// 增加一个钩子，当JVM进程退出时，Server 关闭
		Runtime.getRuntime().addShutdownHook(new Thread() {
			@Override
			public void run() {
				System.err.println("*** shutting down gRPC server since JVM is shutting down");
				if (server != null) {
					server.shutdown();
				}
				System.err.println("*** server shut down！！！！");
			}
		});
		server.awaitTermination();
	}
}
