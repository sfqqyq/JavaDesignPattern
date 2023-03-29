package sfqqyq.桥接模式.笔;

import sfqqyq.桥接模式.尺子.Ruler;

public class BlackPen extends Pen{

    public BlackPen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("黑");
        ruler.regularize();
    }
}
