import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.parameters.options.flag
import com.github.ajalt.clikt.parameters.options.option
import io.ktor.application.*
import io.ktor.http.HttpStatusCode.Companion.OK
import io.ktor.response.*
import io.ktor.routing.*
import io.ktor.server.engine.*
import io.ktor.server.netty.*

fun main(args: Array<String>) = object : CliktCommand("Application description here") {

  private val isDigitalOcean by option(
    "-d", "--digital-ocean",
    help = "Enables routing 'localhost:80/' with OK answer. Use it to mock Digital Ocean healthy checks").flag()

  override fun run() {
    if (isDigitalOcean) {
      mockHealthyChecks()
    }
    echo("Application successfully started")

    /**
     * Your code here
     */
  }

  private fun mockHealthyChecks() = embeddedServer(Netty) {
    routing {
      get("/") { call.respond(OK) }
    }
  }

}.main(args)