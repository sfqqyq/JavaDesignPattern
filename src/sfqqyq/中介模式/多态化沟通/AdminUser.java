package sfqqyq.中介模式.多态化沟通;

public class AdminUser extends User{
    public AdminUser(String name) {
        super(name);
    }

    public void kick(User user){// 踢出其他用户
        user.logout();// 调用被踢用户的注销方法
    }

}
