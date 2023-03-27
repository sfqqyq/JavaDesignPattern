package sfqqyq.享元模式;

public class Client {


    public static void main(String[] args) {
        TileFactory tileFactory = new TileFactory();
        tileFactory.getDrawable("河流").draw(10,10);
        tileFactory.getDrawable("道路").draw(10,20);
        tileFactory.getDrawable("草地").draw(10,30);
        tileFactory.getDrawable("草地").draw(10,40);
        tileFactory.getDrawable("草地").draw(10,50);
        tileFactory.getDrawable("草地").draw(10,60);
        tileFactory.getDrawable("草地").draw(10,70);
        tileFactory.getDrawable("房子").draw(10,80);
        tileFactory.getDrawable("道路").draw(10,90);
        tileFactory.getDrawable("道路").draw(10,100);
    }



    public static void main1(String[] args) {
        // 会加载很慢
        new Tile("河流",10,10).draw();
        new Tile("河流",10,20).draw();
        new Tile("道路",10,30).draw();
        new Tile("草地",10,40).draw();
        new Tile("草地",10,50).draw();
        new Tile("草地",10,60).draw();
        new Tile("草地",10,70).draw();
        new Tile("草地",10,80).draw();
        new Tile("道路",10,90).draw();
        new Tile("道路",10,100).draw();
    }
}
