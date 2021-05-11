package com.itsqq.singleton.test;

/**
 * 单例模式在jdk中的应用
 */
public class SingletonTest {
    public static void main(String[] args) {
        // Runtime 是jdk中经典的饿汉式单例模式
        Runtime runtime = Runtime.getRuntime();
    }
}
