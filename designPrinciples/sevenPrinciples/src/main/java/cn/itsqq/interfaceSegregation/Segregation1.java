package cn.itsqq.interfaceSegregation;

/**
 * 传统方法
 * 类 A 通过接口 Interface1 依赖类 B，
 * 类 C 通过接口 Interface1 依赖类 D。
 *
 * 1)类 A 通过接口 Interface1 依赖类 B，类 C 通过接口 Interface1 依赖类 D，如果接口 Interface1 对于类 A 和类 C
 *   来说不是最小接口，那么类 B 和类 D 必须去实现他们不需要的方法
 */
public class Segregation1 {

    public static void main(String[] args) {
        A a = new A();
        a.depend1(new B());
        C c = new C();
        c.depend2(new D());
    }
}

/**
 * 接口
 */
interface Interface{
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

/**
 * A 依赖于B，只使用接口中三个方法
 * 类A通过接口依赖与B，但是只用到接口中的三个方法，B多实现了两个方法
 */
class A{
    public void depend1(Interface i){
        i.operation1();
        i.operation2();
        i.operation3();
    }
}

/**
 *  C依赖于D，只使用接口中两个个方法
 *  类C通过接口依赖与D，但是只用到接口中的两个方法，D多实现了三个个方法
 */
class C{
    public void depend2(Interface i){
        i.operation4();
        i.operation5();
    }
}

class B implements Interface{

    public void operation1() {
        System.out.println(" B 实现了 operation1");
    }

    public void operation2() {
        System.out.println(" B 实现了 operation2");
    }

    public void operation3() {
        System.out.println(" B 实现了 operation3");
    }

    public void operation4() {
        System.out.println(" B 实现了 operation4");
    }

    public void operation5() {
        System.out.println(" B 实现了 operation5");
    }
}

class D implements Interface{

    public void operation1() {
        System.out.println(" D 实现了 operation1");
    }

    public void operation2() {
        System.out.println(" D 实现了 operation2");
    }

    public void operation3() {
        System.out.println(" D 实现了 operation3");
    }

    public void operation4() {
        System.out.println(" D 实现了 operation4");
    }

    public void operation5() {
        System.out.println(" D 实现了 operation5");
    }
}