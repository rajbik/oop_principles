package abstraction.abstract_classes;

public class Iphone extends Phone{

    public Iphone() {
    }

    public Iphone(String brand, String color, int storage, double price) {
        super(brand, color, storage, price);
    }

    public static final String OS = "IOS";

    @Override
    public void call() {
        System.out.println("Iphone calls");
    }

    @Override
    public void ring() {
        System.out.println("Iphone rings");

    }

    @Override
    public void text() {
        System.out.println("Iphone texts");

    }

    @Override
    public boolean isConvertible() {
        return false;
    }
}
