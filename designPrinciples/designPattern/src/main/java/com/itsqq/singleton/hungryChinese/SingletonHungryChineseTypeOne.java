package com.itsqq.singleton.hungryChinese;

/**
 * 单例模式——第一种饿汉式（静态变量法）
 * 饿汉式（静态变量）
 */
public class SingletonHungryChineseTypeOne {
    // 1、创建私有构造器
    private SingletonHungryChineseTypeOne(){}
    // 2、本类内部创建实例对象
    private final static SingletonHungryChineseTypeOne instance = new SingletonHungryChineseTypeOne();
    // 3、提供一个公有的静态方法，返回实例对象
    public static SingletonHungryChineseTypeOne getInstance(){
        return instance;
    }
}
