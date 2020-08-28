package org.example.party;

import org.example.party.websocket.ServerSocket;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class Main {


    public static void main(String[] args) {
        String host = "localhost";
        int port = 8887;

        WebSocketServer server = new ServerSocket(new InetSocketAddress(host, port));
        server.run();
    }


}
