package com.itsqq.singleton.doubleCheck;

/**
 * 单例模式——第六种双重检查（同步代码块线程安全）
 * 双重检查（同步代码块线程安全）
 * 注：推荐使用，线程安全，效率高
 *
 * 优缺点说明：
 *  1）Double-Check概念是多线程开发中常使用的，如代码中所示，我们进行了两次if(singleton==null)检查，这样就可以保证线程安全了。
 *  2）这样，实例化代码只用执行一次，后面再次访问时，判断if(singleton==null)，直接return实例化对象，也避免的反复进行方法同步。
 *  3）线程安全：延迟加载；效率较高
 *  4）结论：在实际开发中，推荐使用这种单例设计模式
 */
public class SingletonDoubleCheck {
    private static volatile SingletonDoubleCheck instance;
    // 构造器私有化
    private SingletonDoubleCheck(){}
    // 暴露一个获取实例方法
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
