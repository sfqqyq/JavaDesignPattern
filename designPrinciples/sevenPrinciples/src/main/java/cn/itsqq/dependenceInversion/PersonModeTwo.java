package cn.itsqq.dependenceInversion;

/**
 * Person接受消息
 * 使用依赖倒转的方式
 */
public class PersonModeTwo {
    public static void main(String[] args) {
        Person2 person2 = new Person2();
        person2.receive(new WeChart());
        person2.receive(new Email2());
    }
}

interface IReceive{
    public void getInfo();
}

class WeChart implements IReceive{
    @Override
    public void getInfo(){
        System.out.println("WeChart：Hello 微信...");
    }
}

class Email2 implements IReceive{
    @Override
    public void getInfo(){
        System.out.println("新邮件：Hello Email2...");
    }
}

/**
 *使用依赖倒转的方式，可以很轻松的扩展Person类的功能
 */
class Person2{
    public void receive(IReceive receive){
        receive.getInfo();
    }
}
