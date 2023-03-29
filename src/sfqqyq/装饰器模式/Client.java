package sfqqyq.装饰器模式;

public class Client {

    public static void main(String[] args) {
//        new Decorator(new Girl()).show();
        Showable madeupGirl = new Lipstick(new FoundationMakeup(new Girl()));
        madeupGirl.show();
    }

}
