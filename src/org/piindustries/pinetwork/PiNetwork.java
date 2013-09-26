package org.piindustries.pinetwork;

import org.piindustries.pinetwork.client.Client;
import org.piindustries.pinetwork.server.Server;

import java.util.Scanner;
import java.util.logging.Logger;

/**
 * Date: 9/21/13
 * Time: 1:38 PM
 */

public class PiNetwork {

    private final static Logger LOG = Logger.getLogger(PiNetwork.class.getName());

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String input = null;
        Server server = null;
        Client client = null;

        System.out.print("Enter 1 for server or 2 for client: ");
        input = s.next();

        if (input != null) {
            if (input.equals("1")) {
                // Start server
                LOG.info("Waiting for connection...");
                server = new Server(64300);
                try {
                    server.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else if (input.equals("2")) {
                // Start client
                LOG.info("Attempting to connect to server...");
                client = new Client("localhost", 64300, 100);
                try {
                    client.run();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
