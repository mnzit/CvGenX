package com.mnzit.cvgenx.registry;

import com.mnzit.cvgenx.controller.EchoController;
import io.vertx.core.Vertx;
import io.vertx.ext.web.Router;

public class RouterRegistry {

  public static Router register(Vertx vertx) {
    Router router = Router.router(vertx);
    router.get("/echo").handler(EchoController::echo);
    return router;
  }
}
