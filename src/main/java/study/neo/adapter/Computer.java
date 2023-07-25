package study.neo.adapter;

public class Computer {
    public void connect(USB usb) {
        usb.connectViaUSB();
        System.out.println("К компьютеру подключен USB-кабель!");
    }
}
