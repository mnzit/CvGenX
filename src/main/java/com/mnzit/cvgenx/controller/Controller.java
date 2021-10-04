package com.mnzit.cvgenx.controller;

import io.vertx.core.json.Json;
import io.vertx.ext.web.RoutingContext;

public class Controller {

  protected static void prepareJsonResponse(RoutingContext context, Object data, Integer statusCode) {
    context
      .response()
      .setStatusCode(statusCode)
      .putHeader("Content-Type", "application/json")
      .end(Json.encode(data));
  }
}
