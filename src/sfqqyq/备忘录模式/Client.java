package sfqqyq.备忘录模式;

public class Client {
    public static void main(String[] args) {
        Editor editor = new Editor(new Doc("AI的觉醒"));
        editor.append("第一章 混沌初开");
        editor.append("\n 正文20000字");
        editor.append("\n第二章 荒漠之花\n 正文3000字...");
        editor.delete();

        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();
        editor.undo();

    }
}
