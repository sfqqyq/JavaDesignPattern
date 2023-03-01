package sfqqyq.单例模式.懒汉式;

public class Sun {

    // 这里不进行实例化
    private static Sun sun;

    // 私有化构造器
    private Sun(){}

    public Sun getInstance(){
        // 如果无日才造日
        if(sun == null){ // 如果是多线程，两个线程同时过了这个判断，则会得到两个不一样的对象
            sun = new Sun();
        }
        return sun;
    }

    // 使用同步锁解决多线程数据安全问题，不过效率会下降
    public synchronized Sun getInstanceBySync(){
        if(sun == null){
            sun = new Sun();
        }
        return sun;
    }


}
