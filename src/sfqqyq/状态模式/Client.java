package sfqqyq.状态模式;

public class Client {

    public static void main(String[] args) {

        TrafficLight trafficLight = new TrafficLight();
        trafficLight.switchToYellow();
        trafficLight.switchToGreen();
        trafficLight.switchToYellow();
        trafficLight.switchToRed();
        trafficLight.switchToGreen();

    }


    public static void main1(String[] args) {
        Switcher switcher = new Switcher();
        switcher.switchOn();
        switcher.switchOn();
        switcher.switchOff();
        switcher.switchOff();
        switcher.switchOn();
        switcher.switchOff();
    }
}
