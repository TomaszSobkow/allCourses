package computer;

import computer.file.musicFile.Mp3File;
import computer.usbDeviceses.HeadPhone;
import computer.usbDeviceses.Keyboard;
import computer.usbDeviceses.MemoryStick;
import computer.usbDeviceses.Mouse;

public class Main {


    public static void main(String[] args) {
        MemoryStick memoryStick = new MemoryStick("New STICK 3 GB");


        Computer computer = new Computer();
        computer.addNewUsbDevice(new MemoryStick("Sandisk 128GB"));
        computer.addNewUsbDevice(memoryStick);
        computer.addNewUsbDevice(new HeadPhone("Bose"));
        computer.addNewUsbDevice(new Mouse("Dell"));
        computer.addNewUsbDevice(new Keyboard("Logitech"));
        computer.drive().addFile(new Mp3File("Music",1278,"2 Unlimited","Get Ready",320));

        System.out.println(computer);
        computer.removeUsbDevice(memoryStick);
        memoryStick.eject();
        computer.removeUsbDevice(memoryStick);

        //2:07:50
        // on YouTube course https://www.youtube.com/watch?v=OvY0f-IWlos

    }
}
