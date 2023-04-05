package sfqqyq.状态模式;

public class Yellow implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        trafficLight.setState(new Green());
        System.out.println("OK...绿灯亮起60s");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        System.out.println("ERROR......已是黄灯无须再切换");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        trafficLight.setState(new Red());
        System.out.println("OK...红灯亮起60s");
    }
}
