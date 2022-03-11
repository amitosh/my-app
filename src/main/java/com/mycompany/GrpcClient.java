package com.mycompany;

import com.mycompany.grpc.User;
import com.mycompany.grpc.userGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClient
{
    public static void main(String[] args) throws Exception
    {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090).usePlaintext().build();

        userGrpc.userBlockingStub userStub = userGrpc.newBlockingStub(channel);
        User.LoginRequest request = User.LoginRequest.newBuilder().setUsername("aa").setPassword("a").build();
        User.APIResponse response = userStub.login(request);
        System.out.println(response);
    }
}
