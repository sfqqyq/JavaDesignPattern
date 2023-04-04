package sfqqyq.策略模式.万能USB;

public class Computer {
    private USB usb;

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public void compute() {// 计算
        this.usb.read();
    }
}
