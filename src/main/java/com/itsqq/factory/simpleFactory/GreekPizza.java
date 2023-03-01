package com.itsqq.factory.simpleFactory;

public class GreekPizza extends Pizza {
    public GreekPizza(String name){
        this.setName(name);
    }
    public void prepare() {
        System.out.println("准备希腊披萨原材料");
    }
}
