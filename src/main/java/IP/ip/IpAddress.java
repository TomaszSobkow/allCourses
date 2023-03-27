package IP.ip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class IpAddress {

    public static void main(String[] args) throws IOException {
    terminalIP();
    }

    public static void terminalIP() throws IOException
    {
        URL url = new URL("http://checkip.amazonaws.com/");
        InetAddress getIp = InetAddress.getLocalHost();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String localIP = "Local IP: "+getIp.getHostAddress();
        String externalIP = "External IP: "+br.readLine();
        System.out.println(externalIP+"\n"+localIP);
    }


    }

