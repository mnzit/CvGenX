package com.cvgenx.controller;

import io.vertx.mutiny.core.Vertx;
import io.vertx.mutiny.ext.web.client.WebClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
public class EchoController {

    private final Vertx vertx;
    private final WebClient client;

    EchoController(Vertx vertx) {
        this.vertx = vertx;
        this.client = WebClient.create(vertx);
    }

    @GET
    @Produces(MediaType.TEXT_HTML)
    public String echo() {
        return "<h1 style='font-size:30px;color:#AA3939;text-align:center;margin-top:50px;'>CvGenX is running!</h1>";
    }
}