package JavaCore.inner;

public class Car {

    public void printCar() {
        System.out.println("Метод внешего класса");
    }


    public class Driver {
        public void prindDriver() {
            System.out.println("Метод внутреннего класса");
        }
    }
}
