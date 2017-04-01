package com.example

import com.twitter.finatra.http.HttpServer
import com.twitter.finatra.http.routing.HttpRouter

object ExampleServerMain extends ExampleServer

class ExampleServer extends HttpServer {
  override def configureHttp(router: HttpRouter): Unit = {
    router.add[PingController]
  }
}
