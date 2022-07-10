import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.server.application.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun main() {
  localhostServer().start(true)
}

fun localhostServer() = embeddedServer(Netty) {
  routing {
    get("/") { call.respond(OK) }
  }
}