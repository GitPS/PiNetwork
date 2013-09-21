package org.piindustries.pinetwork.client;

import java.io.PrintWriter;
import java.net.Socket;

/**
 * User: Jigsaw
 * Date: 9/21/13
 * Time: 1:50 PM
 */

public class Client {

    private static Socket socket;
    private static PrintWriter printWriter;

    public void start() {
        try {
            socket = new Socket("localhost", 63400);
            printWriter = new PrintWriter(socket.getOutputStream(), true);
            printWriter.println("Connection established!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}