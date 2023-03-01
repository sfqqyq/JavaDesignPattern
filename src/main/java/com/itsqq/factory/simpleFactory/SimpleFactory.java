package com.itsqq.factory.simpleFactory;

/**
 * @desc xxx
 * @author sfqqyq
 * @date 2021/5/13 6:59 下午
 */
public class SimpleFactory {

    /**
     * @desc xxx
     * @author sfqqyq
     * @date 2021/5/13 6:58 下午
     * @param pizzaType xxx
     * @return com.itsqq.factory.simpleFactory.Pizza
     */
    public Pizza creatPizza(String pizzaType){
        Pizza pizza=null;

        if("greek".equals(pizzaType)){
            pizza=new GreekPizza("希腊风味披萨");
        }else if("cheese".equals(pizzaType)){
            pizza=new CheesePizza("奶酪披萨");
        }
        return pizza;
    }
}
