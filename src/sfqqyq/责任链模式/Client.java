package sfqqyq.责任链模式;

public class Client {

    public static void main(String[] args) {
        int amount = 10000;
        Staff staff = new Staff("张飞");
        if(!staff.approve(amount)){
            Manager manager = new Manager("关羽");
            if(!manager.approve(amount)){
                CFO cfo = new CFO("刘备");
                cfo.approve(amount);
            }
        }

    }

}
