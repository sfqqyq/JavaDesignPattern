package sfqqyq.迭代器模式.分离迭代器;

public class DrivingRecorder implements Iterator<String>{

    private int index = -1;// 当前记录位置
    private String[] records = new String[10];// 假设只能记录10条视频

    public void append(String record){
        if(index == 9){// 索引重置，从头覆盖
            index = 0;
        }else {// 正常覆盖下一条
            index++;
        }
        records[index] = record;
    }

    public Iterator<String> iterator(){
        return new Itr();
    }

    private  class Itr implements Iterator<String>{
        int cursor = index;
        int loopCount = 0;

        @Override
        public String next() {
            int i = cursor;// 记录即将放回的游标位置
            if(cursor==0){
                cursor=9;
            }else {
                cursor--;
            }
            loopCount++;
            return records[i];
        }

        @Override
        public boolean hasNext() {
            return loopCount < 10;
        }
    }


    @Override
    public String next() {
        return null;
    }

    @Override
    public boolean hasNext() {
        return false;
    }
}
