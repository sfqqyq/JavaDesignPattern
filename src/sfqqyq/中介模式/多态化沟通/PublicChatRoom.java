package sfqqyq.中介模式.多态化沟通;

import java.util.Objects;

public class PublicChatRoom extends ChatRoom{
    public PublicChatRoom(String name) {
        super(name);
    }

    @Override
    public void register(User user){
        super.register(user);
        System.out.println("系统消息：欢迎【"+user.getName()+"】加入公共聊天室【"+this.name+"】,当前人数："+users.size());
    }

    @Override
    public void deregister(User user){
        super.deregister(user);
        System.out.println("系统消息：【"+user.getName()+"】离开公共聊天室，当前人数："+users.size());
    }



    @Override
    protected void sedMsg(User form, User to, String msg) {
        if(Objects.isNull(to)){
            users.forEach(user -> user.listen(form, null,msg));
            return;
        }
        users.stream()
                .filter(user -> user.equals(to)||user.equals(form))
                .forEach(user -> user.listen(form,to,msg));
    }

    @Override
    protected String processMsg(User form, User to, String msg) {
        String toName="所有人";
        if(!Objects.isNull(to)){
            toName=to.getName();
        }
        return form.getName()+" 对 "+toName+" 说: "+msg;
    }
}
