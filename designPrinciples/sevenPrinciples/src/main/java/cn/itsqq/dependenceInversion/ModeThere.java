package cn.itsqq.dependenceInversion;

public class ModeThere {

    public static void main(String[] args) {
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTv(new xiaomiTV());
        openAndClose.open();
    }
}
/**
 * 方式三：使用setting方式传递依赖
 */
// 接口
interface ITv{
    public void play();
}
// 接口
interface IOpenAndClose{
    public void open();
}
// 实现类，使用set方式依赖ITv接口
class OpenAndClose implements IOpenAndClose{
    private ITv tv;

    public void setTv(ITv tv) {
        this.tv = tv;
    }
    @Override
    public void open() {
        this.tv.play();
    }
}
// 实现接口
class xiaomiTV implements ITv{
    @Override
    public void play() {
        System.out.println("小米大师8K极光体验 run ...");
    }
}

/**
 * 方式二：使用构造器方式传递依赖
 */
//interface IOpenAndClose{
//    public void open();
//}
//interface ITv{
//    public void play();
//}
//class OpenAndClose implements IOpenAndClose{
//    private ITv tv;
//    OpenAndClose(ITv tv){
//        this.tv=tv;
//    }
//    @Override
//    public void open() {
//        this.tv.play();
//    }
//}
//// 实现接口
//class xiaomiTV implements ITv{
//    @Override
//    public void play() {
//        System.out.println("小米大师8K极光体验 run ...");
//    }
//}






/**
 * 方式一：接口传递
 * 电视打开播放
 */
//// 抽象方法，接收接口
//interface ITvOpenAndClose{
//    public void open(ITv tv);
//}
//// ITV 接口
//interface ITv{
//    public void play();
//}
//// 实现接口
//class OpenAndClose implements ITvOpenAndClose{
//    @Override
//    public void open(ITv tv) {
//        tv.play();
//    }
//}
//// 实现接口
//class xiaomiTV implements ITv{
//    @Override
//    public void play() {
//        System.out.println("小米大师8K极光体验 run ...");
//    }
//}