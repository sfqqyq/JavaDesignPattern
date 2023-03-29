package sfqqyq.装饰器模式;

public class FoundationMakeup extends Decorator{

    public FoundationMakeup(Showable showable) {
        super(showable);
    }

    @Override
    public void show() {
        System.out.print("打粉底【");
        super.show();
        System.out.print("】");
    }
}
