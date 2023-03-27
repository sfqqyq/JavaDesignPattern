package sfqqyq.享元模式;

public class House implements Drawable{

    private String image;// 房子图片材质

    public House() {
        this.image="房子";
        System.out.print("从磁盘加载["+image+"]图片，耗时0.5秒...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.print("将图层切换到顶层......");// 房屋盖在地板上，所以切换图层到顶层
        System.out.println("在位置["+x+":"+y+"]上绘制图["+image+"]");
    }
}
