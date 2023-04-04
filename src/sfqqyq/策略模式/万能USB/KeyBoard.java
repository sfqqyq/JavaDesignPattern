package sfqqyq.策略模式.万能USB;

public class KeyBoard implements USB{
    @Override
    public void read() {
        System.out.println("键盘指令数据");
    }
}
