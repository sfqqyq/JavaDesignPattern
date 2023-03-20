package sfqqyq.装饰器模式;

public class Lipstick extends Decorator{

    public Lipstick(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("涂口红【");
        super.show();
        System.out.print("】");
    }
}
