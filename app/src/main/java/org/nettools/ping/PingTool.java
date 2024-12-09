package org.nettools.ping;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public abstract class PingTool {

    public static void pingIpV4(String ipV4) {
        InetAddress ip;

        try {
            ip = InetAddress.getByName(ipV4);

            if (ip.isReachable(5000)) {
                System.out.println("Ping successful to " + ip.getHostAddress());
            } else {
                System.out.println("Ping failed to " + ip.getHostAddress());
            }
        } catch (UnknownHostException uhEx) {
            uhEx.printStackTrace();
        } catch (IOException ioEx) {
            ioEx.printStackTrace();
        }

    }
}
