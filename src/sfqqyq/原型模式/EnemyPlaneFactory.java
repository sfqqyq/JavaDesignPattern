package sfqqyq.原型模式;

public class EnemyPlaneFactory {

    // 使用单例饿汉模式造一个敌机原型
    private static final EnemyPlane protoType = new EnemyPlane(200);


    public EnemyPlane getInstance(int x) throws CloneNotSupportedException {
        EnemyPlane clone = protoType.clone();
        clone.setX(x);
        return clone;
    }

    

}
