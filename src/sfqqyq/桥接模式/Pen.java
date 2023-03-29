package sfqqyq.桥接模式;

// 抽象的笔
public abstract class Pen {
    public abstract void getColor();
    public void draw(){
        getColor();
        System.out.println("△");
    }

}
