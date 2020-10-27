package JavaCore.Pitzaaa;

public class ConcriadPitzza1 extends PizzaBuilder {
    @Override
    public void buildDough() {
        System.out.println("Concriad pitza1 dought");
    }

    @Override
    public void buildSauce() {
        System.out.println("Concriad pitza1 souce");

    }

    @Override
    public void buildTopping() {
        pizza.setTopping("new topping");
        System.out.println("Concriad pitza1 topping");

    }
}
