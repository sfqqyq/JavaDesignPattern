package sfqqyq.工厂模式.抽象工厂.human;

import sfqqyq.工厂模式.抽象工厂.MidClassUnit;

public class Tank extends MidClassUnit {
    public Tank(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("坦克出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("坦克用跑轰击，攻击力："+attack);
    }
}
