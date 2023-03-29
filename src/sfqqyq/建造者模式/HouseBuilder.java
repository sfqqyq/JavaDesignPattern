package sfqqyq.建造者模式;


// 建造房子
public class HouseBuilder implements Builder{

    private Building house;

    public HouseBuilder() {
        this.house = new Building();
    }

    @Override
    public void buildBasement() {
        System.out.println("挖土方、部署管道、线栏，水泥加固，搭建围墙、花园");
        this.house.setBasement("+++++++++\n");
    }

    @Override
    public void buildWall() {
        System.out.println("搭建木质框架，石膏板封墙并粉饰内外墙。");
        this.house.setWall(" |田|田|田|\n");
    }

    @Override
    public void buildRoof() {
        System.out.println("建筑木质屋顶、阁楼，安装烟囱，做好防水。");
        this.house.setRoof("/--------\\\n");
    }

    @Override
    public Building getBuilding() {
        return house;
    }
}
