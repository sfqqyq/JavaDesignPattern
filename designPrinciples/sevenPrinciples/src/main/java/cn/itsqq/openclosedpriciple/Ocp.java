package cn.itsqq.openclosedpriciple;

/**
 * 使用传统的方式写一个画图的功能
 * 在之前的基础上加上一个绘制三角形的功能
 */
public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Round());
        // 新增加一个绘画三角形
        graphicEditor.drawShape(new Triangle());
    }
}

/**
 * 绘制图形
 */
class GraphicEditor{

    public void drawShape(Shape s){
        if(s.m_type == 1){
            drawRectangle();
        }else if(s.m_type==2){
            drawRound();
        }else if(s.m_type==3){ // 新增一个三角形判断
            drawTriangle();
        }
    }
    public void drawRectangle(){
        System.out.println(" 绘制矩形 ");
    }

    public void drawRound(){
        System.out.println(" 绘制圆形 ");
    }

    // 新增一个三角形方法
    public void drawTriangle(){
        System.out.println(" 绘制三角形 ");
    }

}

/**
 * 形状类
 */
class Shape{
    int m_type;
}

/**
 * 矩形
 */
class Rectangle extends Shape{
    public Rectangle(){
        super.m_type=1;
    }
}

/**
 * 圆形
 */
class Round extends Shape{
    public Round(){
        super.m_type=2;
    }
}

/**
 * 新增加一个三角形类别
 */
class Triangle extends Shape{
    public Triangle(){
        super.m_type = 3;
    }
}

