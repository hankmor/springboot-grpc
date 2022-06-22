package com.belonk;

import com.belonk.server.GrpcServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootGrpcServerApplication {
	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(SpringbootGrpcServerApplication.class, args);
		startRpcServer(run);
	}

	public static void startRpcServer(ApplicationContext ctx) {
		try {
			GrpcServer grpcServer = ctx.getBean(GrpcServer.class);
			grpcServer.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
