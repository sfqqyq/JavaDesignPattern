package sfqqyq.模板方法模式;

import sfqqyq.模板方法模式.项目管理模板.ApiProject;
import sfqqyq.模板方法模式.项目管理模板.HRProject;
import sfqqyq.模板方法模式.项目管理模板.PM;

public class Client {

    public static void main(String[] args) {
        PM pm = new HRProject();
        pm.kickoff();

        pm = new ApiProject();
        pm.kickoff();
    }

    public static void main1(String[] args) {
        Mammal mammal=new Bat();
        mammal.live();

        mammal = new Whale();
        mammal.live();

        mammal = new Human();
        mammal.live();
    }
}
