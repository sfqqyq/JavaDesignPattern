package sfqqyq.工厂模式.工厂方法;

import sfqqyq.工厂模式.简单工厂.Boos;
import sfqqyq.工厂模式.简单工厂.Enemy;

public class BoosFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        // boos出现在屏幕正中间
        return new Boos(screenWidth/2,0);
    }
}
