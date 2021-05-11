package com.itsqq.singleton.hungryChinese;

/**
 * 单例模式——第一种饿汉式（静态代码块）
 * 饿汉式（静态代码块）
 * 注：这种单例模式可用，但是可能造成内存浪费
 */
public class SingletonHungryChineseTypeTwo {
    // 1、创建私有构造器，外部不能new
    private SingletonHungryChineseTypeTwo(){}
    // 定义静态变量
    private static SingletonHungryChineseTypeTwo instance;
    // 2、在静态代码块中创建实例对象
    static {
        instance=new SingletonHungryChineseTypeTwo();
    }
    // 3、提供一个公有的静态方法，返回实例对象
    public static SingletonHungryChineseTypeTwo getInstance(){
        return instance;
    }
}
