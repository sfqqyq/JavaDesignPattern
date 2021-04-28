import com.itsqq.singleton.hungryChinese.SingletonHungryChineseTypeOne;
import org.junit.Test;

public class SingletonTest {

    /**
     *  单例模式——第一种饿汉式（静态变量法）
     */
    @Test
    public void test1(){
        SingletonHungryChineseTypeOne instance1 = SingletonHungryChineseTypeOne.getInstance();
        SingletonHungryChineseTypeOne instance2 = SingletonHungryChineseTypeOne.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println("instance1.hashCode() = "+instance1.hashCode());
        System.out.println("instance2.hashCode() = "+instance2.hashCode());
    }
}
