package sfqqyq.策略模式;

public class Client {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();// 实例化计算器
        calculator.setStrategy(new Addition());// 注入加法策略实现
        System.out.println(calculator.getResult(1,2));// 进行加法运算，并输出结果

        calculator.setStrategy(new Subtraction());// 注入减法策略实现
        System.out.println(calculator.getResult(5,8));// 进行减法运算，并输出结果

    }

}
