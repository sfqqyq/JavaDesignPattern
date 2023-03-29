package sfqqyq.工厂模式.工厂方法;

import sfqqyq.工厂模式.简单工厂.Airplane;
import sfqqyq.工厂模式.简单工厂.Enemy;

import java.util.Random;

public class AirplaneFactory implements Factory{
    @Override
    public Enemy create(int screenWidth) {
        Random random = new Random();
        return new Airplane(random.nextInt(screenWidth),0);
    }
}
