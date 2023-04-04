package sfqqyq.迭代器模式.分离迭代器;

public interface Iterator<E> {

    E next();// 返回下一个元素
    boolean hasNext();// 是否还有下一个元素

}
