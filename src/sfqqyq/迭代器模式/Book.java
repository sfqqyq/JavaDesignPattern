package sfqqyq.迭代器模式;

import java.util.ArrayList;
import java.util.List;

public class Book {

    class Page {
        private int index;

        public Page(int index) {
            this.index = index;
        }

        @Override
        public String toString(){
            return "阅读第："+index+"页";
        }
    }

    private List<Page> pages = new ArrayList<>();

    public Book(int pageSize){
        for (int i = 0; i < pageSize; i++) {
            pages.add(new Page(i));
        }
    }

    public void read(){
        for (Page page : pages) {
            System.out.println(page);
        }
    }

    public void read1(){
        System.out.println(pages.get(1));
        System.out.println(pages.get(2));
        System.out.println(pages.get(3));
        System.out.println(pages.get(4));
        System.out.println("......");
        System.out.println(pages.get(99));
    }


}
