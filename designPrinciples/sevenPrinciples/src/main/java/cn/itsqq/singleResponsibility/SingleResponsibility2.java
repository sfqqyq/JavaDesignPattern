package cn.itsqq.singleResponsibility;

/**
 * 方式2
 * 1、遵守单一职责原则
 * 2、但是这样做的改动很大，即将类分解，同时修改客户端
 * 3、改进：直接修改 Vehicle 类，改动的代码会比较少=>方案 3
 */
public class SingleResponsibility2 {

    public static void main(String[] args) {
        RoadVehicle roadVehicle=new RoadVehicle();
        roadVehicle.run("🏍");
        roadVehicle.run("🚗");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("✈️");

    }
}

/**
 * 在陆地上跑的交通工具
 */
class RoadVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑。。。");
    }
}
/**
 * 在天上飞的交通工具
 */
class AirVehicle {
    public void run(String vehicle) {
        System.out.println(vehicle + "在天空中飞。。。");
    }
}
