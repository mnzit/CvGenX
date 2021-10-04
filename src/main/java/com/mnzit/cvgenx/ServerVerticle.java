package com.mnzit.cvgenx;

import com.mnzit.cvgenx.registry.RouterRegistry;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Promise;


public class ServerVerticle extends AbstractVerticle {

  @Override
  public void start(Promise<Void> startPromise) throws Exception {
    vertx
      .createHttpServer()
      .requestHandler(RouterRegistry.register(vertx))
      .listen(8080);
  }
}
