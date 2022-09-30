package net.polvott.apps

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import net.polvott.apps.plugins.*

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0") {
        configureRouting()
    }.start(wait = true)
}
