package sfqqyq.策略模式;

// 计算器

public class Calculator {

    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int getResult(int a,int b){
        return this.strategy.calculator(a,b);// 返回具体策略的运算结果
    }


    /*****原始计算器******/
//    public int add(int a,int b){// 加法
//        return a + b;
//    }
//
//    public int sub(int a,int b){// 减法
//        return a - b;
//    }

}
