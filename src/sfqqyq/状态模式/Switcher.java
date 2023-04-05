package sfqqyq.状态模式;

public class Switcher {
    // true代表开启，false代表关闭
    public boolean flag =false;// 默认关闭
    public void switchOn(){
        if(flag == false){// 如果是关闭状态
            this.flag=true;
            System.out.println("OK...使灯亮");
        }else {
            System.out.println("ERROR...开启状态下无须再开启...");
        }
    }

    public void switchOff(){
        if(flag == true){// 如果是开启状态
            this.flag=false;
            System.out.println("OK...使灯灭");
        }else {
            System.out.println("ERROR...关闭状态下无须再关闭...");
        }
    }

}
