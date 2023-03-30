package sfqqyq.模板方法模式;

public class Whale extends Mammal{
    @Override
    public void move(){
        System.out.println("鲸在水里游着......");
    }
    @Override
    public void eat(){
        System.out.println("捕鱼吃。");
    }
}
