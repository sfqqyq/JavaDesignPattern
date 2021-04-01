package cn.itsqq.interfaceSegregation;

/**
 * 应传统方法的问题和使用接口隔离原则改进
 * 将接口 Interface1 拆分为独立的几个接口，类 A 和类 C 分别与他们需要的接口建立依赖关系。也就是采用接口隔离原则
 */
public class Segregation2 {
    public static void main(String[] args) {

        A1 a1 = new A1();
        C1 c1 = new C1();
        a1.depend1(new B1());
        a1.depend2(new B1());
        a1.depend3(new B1());
        c1.depend1(new D1());
        c1.depend2(new D1());
    }

}

/**
 * A1 类通过接口 Interface1,Interface2 依赖(使用) B1 类。
 */
class A1{
    public void depend1(Interface1 interface1){
        interface1.operation1();
    }
    public void depend2(Interface2 interface2){
        interface2.operation2();
    }
    public void depend3(Interface2 interface2){
        interface2.operation3();
    }
}

/**
 * C1 类通过接口 Interface3依赖(使用) D1 类。
 */
class C1{
    public void depend1(Interface3 interface4){
        interface4.operation4();
    }
    public void depend2(Interface3 interface5){
        interface5.operation5();
    }
}


interface Interface1{
    void operation1();

}
interface Interface2{
    void operation2();
    void operation3();
}
interface Interface3{
    void operation4();
    void operation5();
}

class B1 implements Interface1,Interface2{

    public void operation1() {
        System.out.println("B1 实现了 operation1");
    }

    public void operation2() {
        System.out.println("B1 实现了 operation2");
    }

    public void operation3() {
        System.out.println("B1 实现了 operation3");
    }
}

class D1 implements Interface3{

    public void operation4() {
        System.out.println("D1 实现了 operation4");
    }

    public void operation5() {
        System.out.println("D1 实现了 operation5");
    }
}
