package com.mycompany;

import com.mycompany.user.UserService;
import io.grpc.Server;
import io.grpc.ServerBuilder;

public class GrpcServer
{
    public static void main(String[] args) throws Exception
    {
        Server server = ServerBuilder.forPort(9090).addService(new UserService()).build();
        server.start();
        System.out.println("server started..");
        server.awaitTermination();
    }
}
