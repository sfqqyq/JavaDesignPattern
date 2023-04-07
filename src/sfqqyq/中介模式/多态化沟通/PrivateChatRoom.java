package sfqqyq.中介模式.多态化沟通;

public class PrivateChatRoom extends ChatRoom{
    public PrivateChatRoom(String name) {
        super(name);
    }

    @Override
    public void register(User user){
        if (users.size() == 2) {
            System.out.println("系统消息：聊天室已满");
            return;
        }
        super.register(user);
        System.out.println("系统消息：欢迎【"+user.getName()+"】加入2人聊天室【"+this.name+"】");
    }

    @Override
    public void deregister(User user){
        super.deregister(user);
        System.out.println("系统消息：【"+user.getName()+"】离开聊天室");
    }

    @Override
    protected void sedMsg(User form, User to, String msg) {
        users.forEach(user -> user.listen(form,to,msg));
    }

    @Override
    protected String processMsg(User form, User to, String msg) {

        return form.getName()+" 说： "+msg;
    }
}
