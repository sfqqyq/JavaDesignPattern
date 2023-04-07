package sfqqyq.中介模式.多态化沟通;

import java.util.Objects;

public class User {

    private String name;
    protected ChatRoom chatRoom;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void login(ChatRoom chatRoom){// 用户注册
        chatRoom.register(this);// 调用聊天室连接注册方法
        this.chatRoom=chatRoom;// 注入聊天室引用
    }

    public void logout(){// 用户注销
        chatRoom.deregister(this);// 调用聊天室注销方法
        this.chatRoom=null;// 置空当前聊天室引用
    }

    public void talk(User to,String msg){
        if(Objects.isNull(chatRoom)){
            System.out.println("【"+name+"的对话框】"+"您还没有登陆");
            return;
        }
        chatRoom.sedMsg(this,to,msg);
    }

    public void listen(User from,User to,String msg){
        System.out.println("【"+this.getName()+"的对话框】"+chatRoom.processMsg(from,to,msg));
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null || getClass() != obj.getClass())return false;
        User user = (User)obj;
        return Objects.equals(name,user.name);
    }
}
