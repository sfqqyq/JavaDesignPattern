package com.itsqq.singleton.enmu;

/**
 * 单例模式——枚举（线程安全）
 * 枚举（线程安全）
 * 注：推荐使用，线程安全
 *
 * 优缺点说明：
 * 1、这借助JDK1.5中添加的枚举类来实现单例模式。不仅能避免多线程同步问题，而且还能防止反序列化重新创建的对象。
 * 2、这种方式是Effective java作者Josh Bloch提倡的方式
 * 3、结论：推荐使用
 */
public enum SingletonEnum {
    INSTANCE;
    public void say(){
        System.out.println("ok~");
    }
}
