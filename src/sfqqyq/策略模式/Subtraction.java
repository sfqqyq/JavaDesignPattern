package sfqqyq.策略模式;

public class Subtraction implements Strategy{
    @Override
    public int calculator(int a, int b) {
        return a - b;
    }
}
