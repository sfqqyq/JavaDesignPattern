package sfqqyq.门面模式;

public class Client {

    public void eat(){
        System.out.println("开始用餐......");
    }

    public void wash(){
        System.out.println("洗碗......");
    }

    // 门面模式
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.order();
    }


    // 反面案例
    public static void main1(String[] args) {
        // 找蔬菜商买菜
        VegVendor vegVendor = new VegVendor();
        vegVendor.purchase();
        // 找妹妹下厨
        Helper helper = new Helper();
        helper.cook();
        // 客户端用餐
        Client client = new Client();
        client.eat();
        // 最后还得洗碗，确实有点麻烦
        client.wash();
    }


}
