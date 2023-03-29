package sfqqyq.单例模式.饿汉式;

public class Sun {

    // 自有永有的单例
    private final static Sun sun = new Sun();

    // 私有化构造器
   private Sun(){

   }

   // 方法公开，获取太阳实例
   public static Sun getInstance(){
       return sun;
   }
}

class Test{
    public static void main(String[] args) {
        System.out.println("获取到两个相同的实例");
        System.out.println(Sun.getInstance());
        System.out.println(Sun.getInstance());
    }
}
