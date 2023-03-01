package com.itsqq.singleton.lazyMan;

/**
 * 单例模式——第二种懒汉式（线程不安全式）
 * 懒汉式（线程不安全式）
 * 注：不适合多线程环境
 */
public class SingletonLazyManTypeOne {
    // 1、创建私有构造器，外部不能new
    private SingletonLazyManTypeOne(){}
    // 创建私有静态变量
    private static SingletonLazyManTypeOne instance;
    // 提供一个静态公有方法，当使用到该方法时，才去创建instance
    public static SingletonLazyManTypeOne getInstance(){
        if(instance == null){
            instance = new SingletonLazyManTypeOne();
        }
        return instance;
    }
}
