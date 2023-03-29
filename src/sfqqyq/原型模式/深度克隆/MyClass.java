package sfqqyq.原型模式.深度克隆;

public class MyClass {
    private int value;
    private String address;
    private MyObject myObject;

    public MyClass() {
    }

    public MyClass(MyClass myClass) {
        this.value = myClass.value;
        this.address = myClass.address;
        this.myObject = new MyObject(myClass.myObject);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public MyObject getMyObject() {
        return myObject;
    }

    public void setMyObject(MyObject myObject) {
        this.myObject = myObject;
    }
}
