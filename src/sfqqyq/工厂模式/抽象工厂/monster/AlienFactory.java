package sfqqyq.工厂模式.抽象工厂.monster;

import sfqqyq.工厂模式.抽象工厂.AbstractFactory;
import sfqqyq.工厂模式.抽象工厂.HighClassUnit;
import sfqqyq.工厂模式.抽象工厂.LowClassUnit;
import sfqqyq.工厂模式.抽象工厂.MidClassUnit;

public class AlienFactory implements AbstractFactory {

    private int x;// 工厂横坐标
    private int y;// 工厂纵坐标

    @Override
    public LowClassUnit createLowClass() {
        LowClassUnit unit = new Roach(x, y);
        return unit;
    }

    @Override
    public MidClassUnit createMidClass() {
        MidClassUnit unit = new Poison(x,y);
        return unit;
    }

    @Override
    public HighClassUnit createHighClass() {
        HighClassUnit unit = new Mammoth(x,y);
        return unit;
    }
}
