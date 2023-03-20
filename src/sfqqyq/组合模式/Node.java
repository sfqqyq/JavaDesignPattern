package sfqqyq.组合模式;

public abstract class Node {
    protected String name;// 节点名称

    public Node(String name) {// 构造方法需传入节点名称
        this.name = name;
    }

    // 添加下级子节点方法
    protected abstract void add(Node child);

    protected void tree(int space){
        for (int i = 0; i < space; i++) {
            System.out.print("  ");// 先循环输出space个空格
        }
        System.out.println(name);//接着再输出自己的名字
    }

    protected void tree(){
        tree(0);
    }


}
