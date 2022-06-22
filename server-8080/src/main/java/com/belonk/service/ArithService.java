package com.belonk.service;

import com.belonk.proto.ArithGrpc;
import com.belonk.proto.Int;
import com.belonk.proto.Param;
import com.belonk.proto.Quotient;
import io.grpc.stub.StreamObserver;

/**
 * Created by sun on 2022/6/21.
 *
 * @author sunfuchang03@126.com
 * @since 1.0
 */
public class ArithService extends ArithGrpc.ArithImplBase {
	//~ Static fields/constants/initializer


	//~ Instance fields

	@Override
	public void multiply(Param param, StreamObserver<Int> responseObserver) {
		Int ret = Int.newBuilder().setRet(param.getA() * param.getB()).build();
		responseObserver.onNext(ret);
	}

	@Override
	public void divide(Param param, StreamObserver<Quotient> responseObserver) {
		if (param.getB() == 0) {
			responseObserver.onError(new ArithmeticException("by zero"));
			return;
		}
		int quo = param.getA() / param.getB();
		int mod = param.getA() % param.getB();
		Quotient q = Quotient.newBuilder().setQuo(quo).setRem(mod).build();
		responseObserver.onNext(q);
	}

	//~ Constructors


	//~ Methods


}
