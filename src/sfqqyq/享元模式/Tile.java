package sfqqyq.享元模式;

// 瓦
public class Tile {

    private String image;//图块所用的材质图
    private int x,y;//图块所在坐标

    public Tile(String image, int x, int y) {
        this.image = image;
        System.out.print("从磁盘加载["+image+"]图片，耗时0.5秒...");
        this.x = x;
        this.y = y;
    }

    public void draw(){
        System.out.println("在位置["+x+":"+y+"]上绘制图["+image+"]");
    }

}
