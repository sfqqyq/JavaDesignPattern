package sfqqyq.享元模式;

public class River implements Drawable{

    private String image;// 河流图片材质

    public River() {
        this.image="河流";
        System.out.print("从磁盘加载["+image+"]图片，耗时0.5秒...");
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("在位置["+x+":"+y+"]上绘制图["+image+"]");
    }
}
