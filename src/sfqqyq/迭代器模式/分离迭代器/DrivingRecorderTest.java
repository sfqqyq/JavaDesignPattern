package sfqqyq.迭代器模式.分离迭代器;

public class DrivingRecorderTest {

    private int index = -1;// 当前记录位置
    private String[] records = new String[10];// 假设只能记录10条视频

    public void append(String record){
        if(index == 9){// 索引重置，从头覆盖
            index = 0;
        }else {// 正常覆盖下一条
            index++;
        }
        records[index] = record;
    }

    // 循环数组并显示所有10条记录
    public void display(){
        for (int i = 0; i < 10; i++) {
            System.out.println(i+"："+records[i]);
        }
    }

    // 按顺序从新到旧显示10条记录
    public void displayByOrder(){
        for (int i=index,loopCount=0;loopCount<10;i=i==0?i=9:i-1,loopCount++){
            System.out.println(records[i]);
        }
    }



}
