package sfqqyq.原型模式;

import sfqqyq.原型模式.深度克隆.MyClass;
import sfqqyq.原型模式.深度克隆.MyObject;

class TestMain {

    public static void main(String[] args) {

//        List<EnemyPlane> enemyPlanes=new ArrayList<>();
//        for (int i = 0; i < 500; i++) {
//            EnemyPlane enemyPlane = new EnemyPlane(new Random().nextInt(200));
//            enemyPlanes.add(enemyPlane);
//        }


        /****深拷贝案例****/
        MyClass myClass = new MyClass();
        myClass.setValue(100);
        myClass.setAddress("江南行");
        MyObject myObject = new MyObject();
        myClass.setMyObject(myObject);

        // deepClone
        MyClass deepClone = new MyClass(myClass);
        deepClone.setValue(200);
        deepClone.setAddress("吾悦华府");
        deepClone.getMyObject().setValue(580);

        System.out.println(myClass);
        System.out.println(deepClone);
        System.out.println("");

    }

}
