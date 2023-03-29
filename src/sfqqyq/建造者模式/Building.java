package sfqqyq.建造者模式;

import java.util.ArrayList;
import java.util.List;

public class Building {

    private List<String> buildingComponents  = new ArrayList<>();

    public void setBasement(String basement){ // 地基
        this.buildingComponents.add(basement);
    }

    public void setWall(String wall){ // 墙体
        this.buildingComponents.add(wall);
    }

    public void setRoof(String roof){ //屋顶
        this.buildingComponents.add(roof);
    }

    @Override
    public String toString(){
        String buildStr="";
        for (int i = this.buildingComponents.size()-1; i >=0 ; i--) {
            buildStr+=buildingComponents.get(i);
        }
        return buildStr;
    }


}
