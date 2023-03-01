package com.itsqq.singleton.staticInterior;

/**
 * 单例模式——静态内部类（线程安全）
 * 静态内部类（线程安全）
 * 注：推荐使用，线程安全
 *
 * 优缺点说明：
 * 1、这种方式采用了类装载的机制来保证初始化实例时只有一个线程。
 * 2、静态内部类方式在Singleton类被装载时并不会立即实例化，而是在需要实例化时，调用getInstance方法，才会装载SingletonInstance类，从而完成Singleton的实例化。
 * 3、类的静态属性只会在第一次加载的时候初始化，所以在这里，JVM帮助我们保证了线程的安全性，在类进行初始化时，别的线程是无法进入的。
 * 4、优点：避免了线程不安全，利用静态内部类特点实现延迟加载，效率高
 * 5、结论：推荐使用
 */
public class SingletonStaticInterior {

    // 私有化构造器
    private SingletonStaticInterior(){}

    // 静态内部类，1、保证外部类加载时，静态内部类不加载。2、使用到内部类时才加载（懒加载）3、加载内部类时线程安全，并且只加载一次。
    private static class SingletonInstance{
        private static final SingletonStaticInterior INSTANCE=new SingletonStaticInterior();
    }
    // 暴露一个方法给外部获取实例
    public static SingletonStaticInterior getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
