package sfqqyq.组合模式;

public class Client {
    public static void main(String[] args) {
        Node driveD=new Folder("D盘");

        Node doc=new Folder("文档");
        doc.add(new File("简历.doc"));
        doc.add(new File("项目介绍.doc"));

        driveD.add(doc);

        Node music=new Folder("音乐");
        Node jay=new Folder("周杰伦");
        jay.add(new File("双节棍.mp3"));
        jay.add(new File("告白气球.mp3"));
        jay.add(new File("听妈妈的话.mp3"));

        Node jack=new Folder("张学友");
        jack.add(new File("吻别.mp3"));
        jack.add(new File("一万个伤心的理由.mp3"));

        music.add(jay);
        music.add(jack);

        driveD.add(music);

        driveD.tree();

    }
}
