package computer.usbDeviceses;

public interface USBDevice {

    boolean connect();
    boolean disconnect();
    String getUsbDeviceName();
}
