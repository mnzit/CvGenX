package com.mnzit.cvgenx.controller;

import io.vertx.ext.web.RoutingContext;

import java.util.HashMap;
import java.util.Map;

public class EchoController extends Controller {

  public static void echo(RoutingContext context) {
    System.out.println("Echo called");
    Map<String, String> response = new HashMap<>();
    response.put("app-name", "cvgenx");
    response.put("status", "up");
    prepareJsonResponse(context, response, 200);
  }
}
