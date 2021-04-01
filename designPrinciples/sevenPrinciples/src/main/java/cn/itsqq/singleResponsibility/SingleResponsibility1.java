package cn.itsqq.singleResponsibility;

/**
 * 方式一
 * 1、在方式1种run方法违反了单一职责原则
 * 2、解决的方案非常的简单，根据交通工具运行方法不同，分解成不同类即可
 */
public class SingleResponsibility1 {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.run("🏍");
        vehicle.run("🚗");
        vehicle.run("✈️");

    }
}

/**
 * 交通工具类
 */
class Vehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑。。。");
    }
}
