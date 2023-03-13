package sfqqyq.工厂模式.工厂方法;

import sfqqyq.工厂模式.简单工厂.Enemy;
import sfqqyq.工厂模式.简单工厂.Tank;

import java.util.Random;

public class TankFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random();
        return new Tank(random.nextInt(screenWidth),0);
    }
}
