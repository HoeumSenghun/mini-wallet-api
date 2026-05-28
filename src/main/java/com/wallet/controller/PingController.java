package com.wallet.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ping")
public class PingController {

    //GET http://localhost:8080/wallet/api/ping
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String ping() {
        return "{\"status\":\"UP\",\"service\":\"mini-wallet-api\"}";
    }
}