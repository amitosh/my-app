package com.mycompany.user;

import com.mycompany.grpc.User;
import com.mycompany.grpc.userGrpc;
import io.grpc.stub.StreamObserver;

public class UserService extends userGrpc.userImplBase
{
    @Override
    public void login(User.LoginRequest request, StreamObserver<User.APIResponse> responseObserver)
    {
        System.out.println("inside login");
        String username = request.getUsername();
        String password = request.getPassword();

        User.APIResponse.Builder response = User.APIResponse.newBuilder();
        if(username.equals(password))
        {
            response.setResponseCode(1).setResponseMessage("success").build();
        }
        else
        {
            response.setResponseCode(2).setResponseMessage("failure").build();
        }

        responseObserver.onNext(response.build());
        responseObserver.onCompleted();
    }
}
