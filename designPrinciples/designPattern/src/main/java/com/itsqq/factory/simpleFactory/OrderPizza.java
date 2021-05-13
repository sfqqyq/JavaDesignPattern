package com.itsqq.factory.simpleFactory;

import java.util.Scanner;

public class OrderPizza {

    SimpleFactory simpleFactory;
    Pizza pizza=null;

    public OrderPizza(SimpleFactory simpleFactory){
        this.setFactory(simpleFactory);
    }

    public void setFactory(SimpleFactory simpleFactory){
        // 输入订单类型
        String orderType;
        // 设置简单工厂模式
        this.simpleFactory=simpleFactory;
        do {
            System.out.println("请输入订单类型：");
            orderType = getType();
            pizza = this.simpleFactory.creatPizza(orderType);
            if(pizza == null){
                break;
            }
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        } while (true);

    }

    /**
     * 输入类型
     * @return 返回输入的值
     */
    private String getType() {
        Scanner out=new Scanner(System.in);
        String type = out.next();
        System.out.println("输入的订单类型："+type);
        return type;
    }

}
