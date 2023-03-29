package sfqqyq.工厂模式.抽象工厂.monster;

import sfqqyq.工厂模式.抽象工厂.HighClassUnit;

public class Mammoth extends HighClassUnit {
    public Mammoth(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("猛犸巨兽出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("猛犸巨兽用獠牙顶，攻击力："+attack);
    }
}
