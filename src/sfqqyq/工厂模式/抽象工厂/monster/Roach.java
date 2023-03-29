package sfqqyq.工厂模式.抽象工厂.monster;

import sfqqyq.工厂模式.抽象工厂.LowClassUnit;

public class Roach extends LowClassUnit {
    public Roach(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("蟑螂兵出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("蟑螂兵用爪子挠，攻击力："+attack);
    }
}
