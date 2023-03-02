package sfqqyq.单例模式.双重检查;

public class Sun {

    private volatile static Sun sun; //关键字volatile对静态变量的修饰则能保证变量值在各线程访问时的同步性、唯一性

    // 私有化构造器
    private Sun(){}

    public static Sun getInstance(){ // 华山入口
        if(sun == null){ // 观日台
            synchronized (Sun.class){ // 排队观日
                if(sun==null){
                    sun = new Sun(); // 只有第一个人才能创建太阳
                }
            }
        }
        return sun; // 阳关普照，别人不必再造日
    }
}

class TestMain{

    public static void main(String[] args) {
        System.out.println(Sun.getInstance());
        System.out.println(Sun.getInstance());
    }

}
