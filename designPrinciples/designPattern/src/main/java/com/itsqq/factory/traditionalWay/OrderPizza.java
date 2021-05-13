package com.itsqq.factory.traditionalWay;

import java.util.Scanner;

public class OrderPizza {

    // 构造器
    public OrderPizza(){
        // 披萨类型 手动输入
        String pizzaType;
        Pizza pizza;
        do {
            pizzaType=getType();
            if ("greek".equals(pizzaType)) {
                pizza=new GreekPizza("奶酪披萨");
            } else if ("cheese".equals(pizzaType)) {
                pizza=new CheesePizza("希腊风味披萨");
            }else {
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while (true);
    }

    // 获取pizza类型
    public String getType(){
        System.out.println(" 请输入你需要订购的披萨：");
        Scanner out=new Scanner(System.in);
        return out.next();
    }
}
