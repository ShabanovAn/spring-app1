package JavaCore.Pitzaaa;

public class ConcreadPitza2 extends PizzaBuilder{
    @Override
    public void buildDough() {
        System.out.println("Concriad pitza2 dought");
    }

    @Override
    public void buildSauce() {
        System.out.println("Concriad pitza2 souce");

    }

    @Override
    public void buildTopping() {
        pizza.setTopping("new topping");
        System.out.println("Concriad pitza2 topping");

    }
}
