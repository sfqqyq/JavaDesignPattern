import com.itsqq.singleton.doubleCheck.SingletonDoubleCheck;
import com.itsqq.singleton.hungryChinese.SingletonHungryChineseTypeOne;
import com.itsqq.singleton.hungryChinese.SingletonHungryChineseTypeTwo;
import com.itsqq.singleton.lazyMan.SingletonLazyManTypeOne;
import com.itsqq.singleton.lazyMan.SingletonLazyManTypeThree;
import com.itsqq.singleton.lazyMan.SingletonLazyManTypeTwo;
import com.itsqq.singleton.staticInterior.SingletonStaticInterior;
import org.junit.Test;

public class SingletonTest {

    /**
     *  单例模式——第一种饿汉式（静态变量法）
     */
    @Test
    public void test1(){
        System.out.println("饿汉式（静态变量法）");
        SingletonHungryChineseTypeOne instance1 = SingletonHungryChineseTypeOne.getInstance();
        SingletonHungryChineseTypeOne instance2 = SingletonHungryChineseTypeOne.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }

    /**
     *  单例模式——第一种饿汉式（静态代码块）
     */
    @Test
    public void test2(){
        System.out.println("饿汉式（静态代码块）");
        SingletonHungryChineseTypeTwo instance1 = SingletonHungryChineseTypeTwo.getInstance();
        SingletonHungryChineseTypeTwo instance2 = SingletonHungryChineseTypeTwo.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }

    /**
     *  单例模式——第二种懒汉式（线程不安全式）
     */
    @Test
    public void test3(){
        System.out.println("懒汉式（线程不安全式）");
        SingletonLazyManTypeOne instance1 = SingletonLazyManTypeOne.getInstance();
        SingletonLazyManTypeOne instance2 = SingletonLazyManTypeOne.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }
    /**
     *  单例模式——第二种懒汉式（线程安全式）
     */
    @Test
    public void test4(){
        System.out.println("懒汉式（线程安全式）");
        SingletonLazyManTypeTwo instance1 = SingletonLazyManTypeTwo.getInstance();
        SingletonLazyManTypeTwo instance2 = SingletonLazyManTypeTwo.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }

    /**
     *   单例模式——第二种懒汉式（同步代码块线程不安全）
     */
    @Test
    public void test5(){
        System.out.println("懒汉式（同步代码块线程不安全）");
        SingletonLazyManTypeThree instance1 = SingletonLazyManTypeThree.getInstance();
        SingletonLazyManTypeThree instance2 = SingletonLazyManTypeThree.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }

    /**
     *   单例模式——双重检查（同步代码块线程安全）
     */
    @Test
    public void test6(){
        System.out.println("双重检查（同步代码块线程安全）");
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance2 = SingletonDoubleCheck.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }
    /**
     *   单例模式——静态内部类（线程安全）
     */
    @Test
    public void test7(){
        System.out.println("静态内部类（线程安全）");
        SingletonStaticInterior instance1 = SingletonStaticInterior.getInstance();
        SingletonStaticInterior instance2 = SingletonStaticInterior.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }
}
