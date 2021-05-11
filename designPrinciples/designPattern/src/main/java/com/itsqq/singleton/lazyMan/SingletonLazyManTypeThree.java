package com.itsqq.singleton.lazyMan;

/**
 * 单例模式——第二种懒汉式（同步代码块线程不安全）
 * 懒汉式（同步代码块线程不安全）
 * 注：不推荐使用，线程不安全
 */
public class SingletonLazyManTypeThree {
    // 1、创建私有构造器，外部不能new
    private SingletonLazyManTypeThree(){}
    // 创建私有静态变量
    private static SingletonLazyManTypeThree instance;
    // 提供一个静态公有方法,
    // 即懒汉式
    public static SingletonLazyManTypeThree getInstance(){
        if(instance == null){
            // 即使是在这里加入synchronize关键字，
            synchronized (SingletonLazyManTypeThree.class) {
                instance = new SingletonLazyManTypeThree();
            }
        }
        return instance;
    }
}
