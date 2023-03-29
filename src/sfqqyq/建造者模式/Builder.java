package sfqqyq.建造者模式;

public interface Builder {
    // 控制步骤的工艺
    public void buildBasement();

    public void buildWall();

    public void buildRoof();

    public Building getBuilding();


}
