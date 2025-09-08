package networking;

import java.net.*;

class GoogleIp {
    public static void main(String[] args) throws Exception {
        InetAddress address = InetAddress.getLocalHost();
        System.out.println("Local: " + address);

        address = InetAddress.getByName("www.google.com");
        System.out.println("Google: " + address);
    }
}
