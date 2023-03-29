package sfqqyq.工厂模式.简单工厂;

public class Boos extends Enemy{

    public Boos(int x, int y) {
        super(x, y);
    }

    @Override
    public void show() {
        System.out.println("绘制Boos与上层图层，出现坐标："+x+","+y);
        System.out.println("Boos向玩家发起攻击......");
    }
}
