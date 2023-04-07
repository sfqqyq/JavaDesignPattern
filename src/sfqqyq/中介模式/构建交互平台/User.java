package sfqqyq.中介模式.构建交互平台;

public class User {

    private String name;
    private ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void login(ChatRoom chatRoom){
        this.chatRoom = chatRoom;
        this.chatRoom.register(this);// 注册
    }

    public void talk(String msg){
        chatRoom.sendMsg(this,msg);//往聊天室中发送消息
    }

    public void listen(User fromWhom,String msg){
        System.out.print("【"+this.name+"的对话框】");
        System.out.println(fromWhom.getName()+" 说："+msg);
    }


}
