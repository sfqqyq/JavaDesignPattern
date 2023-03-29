package sfqqyq.桥接模式;

import sfqqyq.桥接模式.尺子.CircleRuler;
import sfqqyq.桥接模式.尺子.SquareRuler;
import sfqqyq.桥接模式.尺子.TriangleRuler;
import sfqqyq.桥接模式.笔.WhitePen;

public class Client {

    public static void main(String[] args) {
        // 白色画笔对应的情况
        new WhitePen(new CircleRuler()).draw();
        new WhitePen(new SquareRuler()).draw();
        new WhitePen(new TriangleRuler()).draw();

        new sfqqyq.桥接模式.笔.BlackPen(new CircleRuler()).draw();
        new sfqqyq.桥接模式.笔.BlackPen(new SquareRuler()).draw();
        new sfqqyq.桥接模式.笔.BlackPen(new TriangleRuler()).draw();
    }


    public static void main1(String[] args) {
        Pen pen = new BlackPen();
        pen.draw();
    }

}
