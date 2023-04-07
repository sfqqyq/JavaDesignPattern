package sfqqyq.中介模式.构建交互平台;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom {

    private String name;

    private List<User> users= new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void register(User user){
        this.users.add(user);
        System.out.println("系统消息：欢迎【"+user.getName()+"】加入聊天室【"+this.name+"】");
    }

    public void sendMsg(User fromWhom, String msg){
        users.stream().forEach(toWhom->toWhom.listen(fromWhom,msg));
    }

}
