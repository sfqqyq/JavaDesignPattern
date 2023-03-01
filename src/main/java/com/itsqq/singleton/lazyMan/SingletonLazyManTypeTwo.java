package com.itsqq.singleton.lazyMan;

/**
 * 单例模式——第二种懒汉式（线程安全式）
 * 懒汉式（线程安全式）
 * 注：不推荐使用，效率低
 */
public class SingletonLazyManTypeTwo {
    // 1、创建私有构造器，外部不能new
    private SingletonLazyManTypeTwo(){}
    // 创建私有静态变量
    private static SingletonLazyManTypeTwo instance;
    // 提供一个静态公有方法,加入同步处理的代码，解决线程安全问题
    // 即懒汉式
    public static synchronized SingletonLazyManTypeTwo getInstance(){
        if(instance == null){
            instance = new SingletonLazyManTypeTwo();
        }
        return instance;
    }
}
