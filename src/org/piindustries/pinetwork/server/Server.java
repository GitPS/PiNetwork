package org.piindustries.pinetwork.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Date: 9/21/13
 * Time: 1:38 PM
 */

public class Server {

    private static ServerSocket sSocket;
    private static Socket cSocket;
    private static BufferedReader br;
    private static String inputLine;

    public void start() {
        try {
            sSocket = new ServerSocket(63400);
            cSocket = sSocket.accept();
            br = new BufferedReader(new InputStreamReader(cSocket.getInputStream()));
            while ((inputLine = br.readLine()) != null) {
                System.out.println(inputLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
