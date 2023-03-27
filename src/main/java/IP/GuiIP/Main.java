package IP.GuiIP;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException {
        URL url = new URL("http://checkip.amazonaws.com/");
        InetAddress getIp = InetAddress.getLocalHost();
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
        String localIP = "Local IP: "+getIp.toString().substring(getIp.toString().indexOf('/')+1);
        String externalIP = "External IP: "+br.readLine();

        JOptionPane.showMessageDialog(null,localIP+"\n"+externalIP);
    }
}
