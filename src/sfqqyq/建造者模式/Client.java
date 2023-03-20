package sfqqyq.建造者模式;

public class Client {

    public static void main(String[] args) {
        Director director = new Director(new HouseBuilder());
        System.out.println(director.direct());

        Director director1 = new Director(new ApartmentBuilder());
        System.out.println(director1.direct());

    }



}
