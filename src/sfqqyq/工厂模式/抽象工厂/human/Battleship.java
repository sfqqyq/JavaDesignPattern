package sfqqyq.工厂模式.抽象工厂.human;

import sfqqyq.工厂模式.抽象工厂.HighClassUnit;

public class Battleship extends HighClassUnit {
    public Battleship(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("战舰出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("战舰用机关炮打击，攻击力："+attack);
    }
}
