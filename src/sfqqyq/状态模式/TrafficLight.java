package sfqqyq.状态模式;

public class TrafficLight {

    State state = new Red();// 默认红灯

    public void setState(State state) {
        this.state = state;
    }

    void switchToGreen() {
        state.switchToGreen(this);
    }
    void switchToYellow(){
        state.switchToYellow(this);
    }
    void switchToRed(){
        state.switchToRed(this);
    }

}
