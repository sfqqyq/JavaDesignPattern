package sfqqyq.组合模式;

public class File extends Node{

    public File(String name) {
        super(name);
    }

    @Override
    protected void add(Node child) {
//        System.out.println("不能添加子节点。");
        throw new RuntimeException("文件不能添加子节点。");
    }

    @Override
    public void tree(int space){
        super.tree(space);
    }

}
