package sfqqyq.装饰器模式;

public abstract class Decorator implements Showable{

    // 被展示者的展示者
    private Showable showable;

    public Decorator(Showable showable) {
        this.showable = showable;
    }

    @Override
    public void show() {
//        System.out.print("粉饰【");// 化妆品粉饰开始
        showable.show();// 被粉饰者的原生展示方法
//        System.out.print("】");// 粉饰结束
    }
}
