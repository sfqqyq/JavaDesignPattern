package sfqqyq.桥接模式.笔;

import sfqqyq.桥接模式.尺子.Ruler;

public class WhitePen extends Pen{

    public WhitePen(Ruler ruler) {
        super(ruler);
    }

    @Override
    public void draw() {
        System.out.print("白色");
        ruler.regularize();
    }
}
