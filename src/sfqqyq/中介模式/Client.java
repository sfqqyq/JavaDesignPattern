package sfqqyq.中介模式;

public class Client {

    public static void main(String[] args) {
        People p3 = new People("张三");
        People p4 = new People("李四");

        // 要交流必须持有彼此的引用，强耦合，如果是多方会谈则这是灾难
        p3.connect(p4);
        p4.connect(p3);

        p3.talk("早上好");
        p4.talk("早上好，三哥");

    }

}
