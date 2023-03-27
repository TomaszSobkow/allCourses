package computer.usbDeviceses;

public class Keyboard implements USBDevice{

    private String name;

    public Keyboard(String name){
        this.name = name;
    }
    @Override
    public boolean connect() {
        System.out.println("Keyboard Connected");
        return true;
    }

    @Override
    public boolean disconnect() {

        System.out.println("Keyboard Disconnected");
        return true;
    }

    @Override
    public String getUsbDeviceName() {
        return this.name;
    }
}
