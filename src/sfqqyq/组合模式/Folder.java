package sfqqyq.组合模式;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Node{

    private List<Node> childrenNodes=new ArrayList<>();

    public Folder(String name) {
        super(name);// 调用父类的构造方法
    }

    @Override
    protected void add(Node child) {
        childrenNodes.add(child);//可以添加子节点
    }

    @Override
    public void tree(int space){
        super.tree(space);// 调用父类tree方法列出自己的名字
        space++;// 在循环的子节点前，空格数要加1
        for (Node node : childrenNodes) {
            node.tree(space);// 调用子节点的tree方法
        }

    }
}
