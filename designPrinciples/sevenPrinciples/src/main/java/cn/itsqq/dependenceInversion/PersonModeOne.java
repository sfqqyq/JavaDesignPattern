package cn.itsqq.dependenceInversion;

/**
 * Person接受消息
 * 传统方式一
 */
public class PersonModeOne {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}

class Email{
    public void getInfo(){
        System.out.println("新邮件：Hello Email");
    }
}

/**
 * 方式一：Person类与Email类产生了依赖，如果想要扩张功能会比较麻烦。
 * 1、简单，比较容易想到
 * 2、如果我们获取的对象是微信，短信等等，则新增类，同时Person也要增加相应的接收方法。
 * 3、解决思路：引入一个抽象的接口IReceiver，表示接收者，这样Person类与接口IReceiver发生依赖因为Email，
 *    WeiXin等等属于接收的范围，他们各自实现IReceiver接口就ok，这样我们就符合依赖倒转
 */
class Person{
    public void receive(Email email){
        email.getInfo();
    }
}
