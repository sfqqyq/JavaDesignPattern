package sfqqyq.建造者模式;

// 工程总检
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void setBuilder(Builder builder) {
        this.builder = builder;
    }

    public Building direct(){
        // 控制工序，建造顺序，可能复杂
        System.out.println("=====项目进行启动。=====");
        // 第一步：打好地基
        builder.buildBasement();
        // 第二步：建造框架、墙体
        builder.buildWall();
        // 第三步：封顶
        builder.buildRoof();
        System.out.println("====工程项目竣工。====");
        return builder.getBuilding();
    }

}
