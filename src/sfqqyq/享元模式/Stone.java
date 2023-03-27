package sfqqyq.享元模式;

public class Stone implements Drawable{

    private String image;// 道路图片材质

    public Stone() {
        this.image="道路";
        System.out.print("从磁盘加载["+image+"]图片，耗时0.5秒...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在位置["+x+":"+y+"]上绘制图["+image+"]");
    }
}
