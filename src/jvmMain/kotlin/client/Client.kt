package client

import java.net.Socket

class Client() {
    private val client = Socket("127.0. 0.1", 1000)

    fun write(data: String) {
        client.getOutputStream().write(data.toByteArray())
    }

    fun read(): String {
        return client.getInputStream().read().toString()
    }


}