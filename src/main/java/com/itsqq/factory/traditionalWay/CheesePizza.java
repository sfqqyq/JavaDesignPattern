package com.itsqq.factory.traditionalWay;

public class CheesePizza extends Pizza{
    public CheesePizza(String name){
        this.setName(name);
    }
    public void prepare() {
        System.out.println("准备奶酪披萨原材料");
    }
}
