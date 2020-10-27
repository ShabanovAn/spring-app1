package JavaCore.AbstractFactory;

public class Nissan implements Factory {
    @Override
    public Product1 createProduct1() {
        return new MotorNissan();
    }

    @Override
    public Product2 createProduct2() {
        return new ShinaNissan();
    }
}
