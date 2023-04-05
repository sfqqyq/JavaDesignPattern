package sfqqyq.备忘录模式;

import java.util.ArrayList;
import java.util.List;

public class Editor {

    private Doc doc;

    private List<History> historyRecords;// 历史记录列表
    private int historyPosition=-1;// 历史记录当前位置

    public Editor(Doc doc) {
        System.out.println("<<<打开文档"+doc.getTitle());
        this.doc = doc;// 载入文档
        historyRecords = new ArrayList<>();
        backup();
        show();
    }

    public void append(String text){
        System.out.println("<<<插入操作");
        this.doc.setBody(this.doc.getBody()+text);
        backup();
        show();
    }
    public void delete(){
        System.out.println("<<<删除操作");
        this.doc.setBody("");
        backup();// 删除后保存一份历史记录
        show();
    }

    public void save(){
        System.out.println("<<<存盘操作");
    }

    public void backup(){// 备份操作
        historyRecords.add(doc.createHistory());
        historyPosition++;
    }

    public void undo(){// 撤销操作
        System.out.println("<<<撤销操作");
        if (historyPosition == 0){
            return;// 到头了不能再撤销
        }

        historyPosition--;// 历史记录位置回溯一次
        History history = historyRecords.get(historyPosition);
        doc.restoreHistory(history);// 取出历史记录并恢复至文档
        show();
    }



    public void show(){
        System.out.println(this.doc.getBody());
        System.out.println(">>>文档结束\n");
    }


}
