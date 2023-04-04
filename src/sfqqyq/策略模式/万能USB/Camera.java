package sfqqyq.策略模式.万能USB;

public class Camera implements USB{
    @Override
    public void read() {
        System.out.println("视频流数据......");
    }
}
