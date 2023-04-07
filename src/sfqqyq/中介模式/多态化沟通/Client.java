package sfqqyq.中介模式.多态化沟通;

public class Client {

    public static void main(String[] args) {
        ChatRoom chatRoom=new PrivateChatRoom("私人聊天室");
        User p3 = new User("张三");
        User p4 = new User("李四");
        p3.login(chatRoom);
        p4.login(chatRoom);

        p3.talk(p4,"你好呀。。。");
        p4.talk(p3,"你好");
    }

    public static void main1(String[] args) {
        ChatRoom chatRoom=new PublicChatRoom("公共聊天室");
        User p3 = new User("张三");
        User p4 = new User("李四");
        User p5 = new User("王五");

        p3.login(chatRoom);
        p4.login(chatRoom);
        p5.login(chatRoom);


        chatRoom.sedMsg(p3,null,"哈哈哈");

        chatRoom.sedMsg(p4,p5,"你今天出去吗？");


    }

}
