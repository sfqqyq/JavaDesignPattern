package sfqqyq.模板方法模式;

// 哺乳动物
public abstract class Mammal {

    public abstract void move();
    public abstract void eat();

    public void live(){
        move();
        eat();
    }

}
