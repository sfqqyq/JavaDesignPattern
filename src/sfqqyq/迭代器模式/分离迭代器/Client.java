package sfqqyq.迭代器模式.分离迭代器;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        DrivingRecorder dr = new DrivingRecorder();

        for (int i = 0; i < 12; i++) {
            dr.append("视频_"+i);
        }
        List<String> uStorage= new ArrayList<>();
        Iterator<String> it = dr.iterator();
        while (it.hasNext()){
            String video = it.next();
            System.out.println(video);
            if ("视频_10".equals(video)||"视频_8".equals(video)){
                uStorage.add(video);
            }
        }
    }

    public static void main1(String[] args) {
        DrivingRecorderTest dr = new DrivingRecorderTest();
        for (int i = 0; i < 12; i++) {
            dr.append("视频_"+i);
        }
        dr.display();
        dr.displayByOrder();

    }



}
