package sfqqyq.备忘录模式;

public class Doc {
    private String title;
    private String body;

    public Doc(String title) {
        this.title = title;// 新建文档新命名
        this.body="";// 新建文档默认为空
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public History createHistory(){
        return new History(body);
    }

    public void restoreHistory(History history){
        this.body=history.getBody();// 恢复历史记录
    }

}
