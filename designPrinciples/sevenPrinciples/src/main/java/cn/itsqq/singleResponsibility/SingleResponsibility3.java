package cn.itsqq.singleResponsibility;

/**
 * 方式3
 * 1、这种修改方法没有对原来的类做大的修改，只是增加方法
 * 2、这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责
 */
public class SingleResponsibility3 {

    public static void main(String[] args) {

        Vehicle3 vehicle3 = new Vehicle3();
        vehicle3.run("🚗");
        vehicle3.airRun("✈️");

    }

}

/**
 * 交通工具类
 */
class Vehicle3 {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑。。。");
    }
    public void airRun(String vehicle) {
        System.out.println(vehicle + "在天空中飞。。。");
    }
}
