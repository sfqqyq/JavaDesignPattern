package sfqqyq.工厂模式.抽象工厂.human;

import sfqqyq.工厂模式.抽象工厂.LowClassUnit;

public class Marine extends LowClassUnit{
    public Marine(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("士兵出现在位置：["+x+","+y+"]");
    }

    @Override
    public void attach() {
        System.out.println("士兵用机关枪射击，攻击力："+attack);
    }
}
