package sfqqyq.原型模式;

import java.io.*;

/**
 * 战机类
 */
public class EnemyPlane implements Cloneable,Serializable{

    private Bullet bullet;

    private int x;// 敌机横坐标
    private int y=0;// 敌机纵坐标，初始为0

    public EnemyPlane(int x){//构造器
        this.x=x;
    }

    public int getX(){
        return this.x;
    }

    public int getY(){
        return this.y;
    }

    public void fly(){// 让敌机飞
        y++;// 每调用一个，敌机飞行时纵坐标+1
    }

    public void setX(int x){
        this.x=x;
    }

    public void setBullet(Bullet bullet){
        this.bullet=bullet;
    }


    @Override
    public EnemyPlane clone() throws CloneNotSupportedException {
        EnemyPlane clonePlane= (EnemyPlane) super.clone();
//        clonePlane.setBullet(this.bullet.clone());// 对子弹进行深拷贝
        return clonePlane;
    }

    public EnemyPlane deepClone() throws IOException, ClassNotFoundException { // 性能开销大
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);
        ByteArrayInputStream bais = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bais);
        return (EnemyPlane) ois.readObject();
    }


}

