package sfqqyq.工厂模式;

import sfqqyq.工厂模式.工厂方法.AirplaneFactory;
import sfqqyq.工厂模式.工厂方法.BoosFactory;
import sfqqyq.工厂模式.工厂方法.Factory;
import sfqqyq.工厂模式.工厂方法.TankFactory;
import sfqqyq.工厂模式.抽象工厂.AbstractFactory;
import sfqqyq.工厂模式.抽象工厂.HighClassUnit;
import sfqqyq.工厂模式.抽象工厂.LowClassUnit;
import sfqqyq.工厂模式.抽象工厂.MidClassUnit;
import sfqqyq.工厂模式.抽象工厂.human.HumanFactory;
import sfqqyq.工厂模式.抽象工厂.monster.AlienFactory;
import sfqqyq.工厂模式.简单工厂.Airplane;
import sfqqyq.工厂模式.简单工厂.SimpleFactory;
import sfqqyq.工厂模式.简单工厂.Tank;

import java.util.Random;

public class TestMain {

    public static void main(String[] args) {
        // 使用抽象工厂类创建人类与怪兽大战

        // 创建人类工厂
        AbstractFactory factory = new HumanFactory(10, 30);
        LowClassUnit marine = factory.createLowClass();
        marine.show();
        MidClassUnit tank = factory.createMidClass();
        tank.show();
        HighClassUnit ship = factory.createHighClass();
        ship.show();

        // 创建人类工厂
        factory = new AlienFactory();
        LowClassUnit roach = factory.createLowClass();
        roach.show();
        MidClassUnit poison = factory.createMidClass();
        poison.show();
        HighClassUnit mammoth = factory.createHighClass();
        mammoth.show();

        System.out.println("开始两族大混战...");
        marine.attach();
        roach.attach();
        ship.attach();
        mammoth.attach();
        tank.attach();
        poison.attach();


    }

    public static void main3(String[] args) {
        // 对敌人进行工业标准化，对不同类型的敌人创建不同类型的工厂
        System.out.println("开始游戏");
        int screenWidth=100;
        Factory factory = new TankFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }

        factory = new AirplaneFactory();
        for (int i = 0; i < 5; i++) {
            factory.create(screenWidth).show();
        }

        System.out.println("抵达关底");
        factory = new BoosFactory();
        factory.create(screenWidth).show();

    }

    public static void main2(String[] args) {
        //使用简单工厂的方式创建敌人
        System.out.println("游戏开始");
        SimpleFactory factory = new SimpleFactory(100);
        factory.create("Airplane").show();
        factory.create("Tank").show();
    }


    public static void main1(String[] args) {
        System.out.println("强耦合的方式创建敌人");
        int screenWidth=100;

        System.out.println("游戏开始");
        Random random = new Random();
        // 随机一个x坐标
        int x = random.nextInt(screenWidth);
        Airplane airplane = new Airplane(x, 0);
        airplane.show();

        x = random.nextInt(screenWidth);
        Tank tank = new Tank(x, 0);
        tank.show();
    }

}
