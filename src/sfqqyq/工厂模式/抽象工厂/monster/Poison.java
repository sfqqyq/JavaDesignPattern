package sfqqyq.工厂模式.抽象工厂.monster;

import sfqqyq.工厂模式.抽象工厂.MidClassUnit;

public class Poison extends MidClassUnit {

    public Poison(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("毒液兵出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("毒液兵用毒液喷射，攻击力："+attack);
    }
}
