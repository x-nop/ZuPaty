package org.example.party;

import org.java_websocket.WebSocket;
import org.java_websocket.handshake.ClientHandshake;
import org.java_websocket.server.WebSocketServer;

import java.net.InetSocketAddress;

public class Main extends WebSocketServer {


    public Main(InetSocketAddress address){
        super(address);
    }

    @Override
    public void onOpen(WebSocket webSocket, ClientHandshake clientHandshake) {
        webSocket.send("Welcome to the Server.");

    }
    @Override
    public void onClose(WebSocket webSocket, int i, String s, boolean b) {

    }
    @Override
    public void onMessage(WebSocket webSocket, String s) {
        webSocket.send(s);
    }
    @Override
    public void onError(WebSocket webSocket, Exception e) {

    }

    public void onStart() {

    }

    public static void main(String[] args) {
        String host = "localhost";
        int port = 8887;

        WebSocketServer server = new Main(new InetSocketAddress(host, port));
        server.run();
    }


}
