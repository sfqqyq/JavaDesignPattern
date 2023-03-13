package sfqqyq.工厂模式.简单工厂;

import java.util.Random;

public class SimpleFactory {

    private int screenWidth;
    private Random random;

    public SimpleFactory(int screenWidth) {
        this.screenWidth = screenWidth;
        this.random = new Random();
    }

    public Enemy create(String type){
        int x = random.nextInt(screenWidth);
        Enemy enemy=null;
        switch (type){
            case "Airplane":
                enemy = new Airplane(x,0);
                break;
            case "Tank":
                enemy = new Tank(x,0);
                break;
        }
        return enemy;

    }

}
