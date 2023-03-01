package com.itsqq.factory.simpleFactory;

public abstract class Pizza {

    private String name;

    public void setName(String name){
        this.name=name;
    }

    /**
     * 准备原材料
     */
    public abstract void prepare();

    /**
     * 烘烤
     */
    public void bake(){
        System.out.println(name+"：烘烤披萨");
    }

    /**
     * 切割
     */
    public void cut(){
        System.out.println(name+"：切割披萨");
    }

    /**
     * 打包
     */
    public void box(){
        System.out.println(name+"：打包披萨");
    }

}

