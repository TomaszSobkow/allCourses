package computer;

import computer.drive.Drive;
import computer.drive.SSD_Drive;
import computer.usbDeviceses.*;


import java.util.ArrayList;
import java.util.List;

public class Computer {

    private Monitor monitor;
    private Drive drive;
    private HeadPhone headPhone;

    private List<USBDevice> USBDeviceList = new ArrayList<>();

    public Computer(){
    this.monitor = new Monitor();
    this.drive = new SSD_Drive();

    }

    public Monitor getMonitor() { return monitor; }
    public void setMonitor(Monitor monitor) { this.monitor = monitor; }

    public Drive drive() { return drive; }
    public void setDrive(Drive drive) { this.drive = drive; }

    public HeadPhone getHeadPhone() { return headPhone; }
    public void setHeadPhone(HeadPhone headPhone) { this.headPhone = headPhone; }

    public List<USBDevice> getUSBDevices() {

        return USBDeviceList;
    }

    public void addNewUsbDevice(USBDevice newUSbDevice){
        boolean isConnected = newUSbDevice.connect();
        if(isConnected){
            USBDeviceList.add(newUSbDevice);
        }
    }

    public void removeUsbDevice(USBDevice usbDevice){
        if(USBDeviceList.contains(usbDevice)){
            boolean isDisconnected  = usbDevice.disconnect();
            if(isDisconnected){
               USBDeviceList.remove(usbDevice);
            }
        }
    }
    @Override
    public String toString() {

        String headPhoneAsString = "";
        String memoryStickasString = "";
        String keyboardAsString = "";
        String mousAsString = "";
        for(USBDevice usbDevice: USBDeviceList){
            if(usbDevice instanceof Mouse){
                mousAsString = "\n\tMouse: " + usbDevice.getUsbDeviceName();
            }

            if(usbDevice instanceof MemoryStick){
                memoryStickasString = "\n\tMemory Stick: " + usbDevice.getUsbDeviceName();
            }

            if(usbDevice instanceof Keyboard){
                keyboardAsString = "\n\tKeyboard: " + usbDevice.getUsbDeviceName();
            }


            if(usbDevice instanceof HeadPhone){
                headPhoneAsString = "\n\tHeadphone: " + usbDevice.getUsbDeviceName();

            }
        }

        String listOfFiles = drive().fileList().isEmpty()? "" : "\n\tList of Files: ";

        return "\nComputer" +
                  this.monitor +
                  this.drive +
                  headPhoneAsString +
                  memoryStickasString+
                  keyboardAsString+
                  mousAsString+
                  listOfFiles + drive().fileList();
    }
}

