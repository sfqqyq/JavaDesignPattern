package sfqqyq.中介模式.构建交互平台;

public class Client {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom("设计模式");

        User p3 = new User("张三");
        User p4 = new User("李四");
        User p5 = new User("王五");
        p3.login(chatRoom);
        p4.login(chatRoom);



        p3.talk("你好，四兄弟，就你一个在啊？");
        p4.talk("是呀，三哥。");


        p5.login(chatRoom);

        p3.talk("瞧，王老五也来了。");

    }
}
