package sfqqyq.状态模式;

public class Green implements State{
    @Override
    public void switchToGreen(TrafficLight trafficLight) {
        System.out.println("ERROR......已是绿灯无须再切换");
    }

    @Override
    public void switchToYellow(TrafficLight trafficLight) {
        trafficLight.setState(new Yellow());
        System.out.println("OK...黄灯亮起5s");
    }

    @Override
    public void switchToRed(TrafficLight trafficLight) {
        System.out.println("ERROR......绿灯不能切换成红灯");
    }
}
