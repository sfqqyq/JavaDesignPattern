package sfqqyq.门面模式;

public class Facade {

    private VegVendor vegVendor;
    private Chef chef;
    private Waiter waiter;
    private Cleaner cleaner;

    public Facade() {
        this.vegVendor = new VegVendor();// 找供货商
        vegVendor.purchase();// 开门前就找蔬菜商准备好蔬菜
        this.chef = new Chef();// 找厨师
        this.waiter = new Waiter();// 找服务员
        this.cleaner = new Cleaner();// 雇佣清洁工、洗碗工
    }

    public void order(){
        // 点菜
        waiter.order();
        // 做饭
        chef.cook();
        // 上菜
        waiter.server();
        // 清理桌子
        cleaner.clean();
        // 洗碗碟
        cleaner.wash();
    }
}
