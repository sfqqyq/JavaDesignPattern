package sfqqyq.原型模式.深度克隆;

public class MyObject {

    private int value;

    public MyObject() {
    }

    public MyObject(MyObject myObject) {
        this.value=myObject.value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
