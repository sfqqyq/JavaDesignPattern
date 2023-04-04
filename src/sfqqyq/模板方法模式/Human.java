package sfqqyq.模板方法模式;

public class Human extends Mammal{
    @Override
    public void move(){
        System.out.println("人类在路上开着车......");
    }
    @Override
    public void eat(){
        System.out.println("去公司挣钱、吃饭。");
    }
}
