package sfqqyq.工厂模式.抽象工厂.human;

import sfqqyq.工厂模式.抽象工厂.AbstractFactory;
import sfqqyq.工厂模式.抽象工厂.HighClassUnit;
import sfqqyq.工厂模式.抽象工厂.LowClassUnit;
import sfqqyq.工厂模式.抽象工厂.MidClassUnit;

public class HumanFactory implements AbstractFactory {

    private int x;// 工厂横坐标
    private int y;// 工厂纵坐标

    public HumanFactory(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Marine(x,y);
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Tank(x,y);
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Battleship(x,y);
        return unit;
    }
}
