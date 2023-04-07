package sfqqyq.中介模式.多态化沟通;

import java.util.ArrayList;
import java.util.List;

public abstract class ChatRoom {

    protected String name;
    protected List<User> users=new ArrayList<>();

    public ChatRoom(String name) {
        this.name = name;
    }

    public void register(User user){
        this.users.add(user);
    }

    public void deregister(User user){
        users.remove(user);
    }

    protected abstract void sedMsg(User form,User to,String msg);
    protected abstract String processMsg(User form,User to,String msg);

}
