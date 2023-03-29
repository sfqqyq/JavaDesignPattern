package sfqqyq.桥接模式.笔;

import sfqqyq.桥接模式.尺子.Ruler;

public abstract class Pen {
    protected Ruler ruler;// 尺子的作用

    public Pen(Ruler ruler) {
        this.ruler = ruler;
    }

    public abstract void draw();// 抽象办法

}
