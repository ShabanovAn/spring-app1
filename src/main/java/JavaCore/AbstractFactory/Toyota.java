package JavaCore.AbstractFactory;

public class Toyota implements Factory {
    @Override
    public Product1 createProduct1() {
        return new MotorToyota();
    }

    @Override
    public Product2 createProduct2() {
        return new ShinaToyota();
    }
}
