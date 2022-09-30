package net.polvott.apps.plugins

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.request.*

fun Application.configureRouting() {

    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/name/{name}") {
            val name = call.parameters["name"]
            call.respondText("Hello " + name + "\n")
        }
    }
}
