package cn.itsqq.openclosedpriciple.improve;

/**
 * 使用符合开闭原则的方式
 */
public class Ocp {
    /**
     * 并没有修改使用方的代码
     */
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Round());
        graphicEditor.drawShape(new Triangle());
        graphicEditor.drawShape(new OtherShape());
    }
}

/**
 * 绘制图形
 */
class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}

/**
 * 将shape定义为一个抽象类，并添加一个draw()抽象方法
 */
abstract class Shape{
    int m_type;
    public abstract void draw();
}

/**
 * 矩形
 */
class Rectangle extends Shape{
    public Rectangle(){
        super.m_type=1;
    }

    @Override
    public void draw() {
        System.out.println(" 绘制矩形 ");
    }
}

/**
 * 圆形
 */
class Round extends Shape{
    public Round(){
        super.m_type=2;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制圆形 ");
    }
}

/**
 * 三角形
 */
class Triangle extends Shape{
    public Triangle(){
        super.m_type = 3;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制三角形 ");
    }
}

/**
 * 绘制其他图形
 */
class OtherShape extends Shape{
    public OtherShape(){
        super.m_type = 4;
    }
    @Override
    public void draw() {
        System.out.println(" 绘制其他图形 ");
    }
}

