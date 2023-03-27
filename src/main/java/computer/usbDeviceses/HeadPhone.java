package computer.usbDeviceses;

public class HeadPhone implements USBDevice{

    private String headPhoneName ;

    public HeadPhone(String headPhoneName) {
        this.headPhoneName = headPhoneName;
    }

    @Override
    public boolean connect() {
        System.out.println("Headphone Connected");
        return true; }
    @Override
    public boolean disconnect() {
        System.out.println("Headphone Disconnected");
        return true; }
    @Override
    public String getUsbDeviceName() {
        return headPhoneName; }

}
