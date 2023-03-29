package sfqqyq.工厂模式.抽象工厂;

public interface AbstractFactory {

    LowClassUnit createLowClass();// 初级兵种制造标准
    MidClassUnit createMidClass();// 中级兵种制造标准
    HighClassUnit createHighClass();// 高级兵种制造标准


}
