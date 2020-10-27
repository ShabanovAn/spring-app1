package JavaCore.Pitzaaa;

public class MaimPitza {
    public static void main(String[] args) {
        Waiter waiter = new Waiter();
        PizzaBuilder pizzaBuilder =  new ConcriadPitzza1();
      //  pizzaBuilder = new ConcreadPitza2();
        waiter.setPizzaBuilder(pizzaBuilder);
        waiter.constructPizza();


    }
}

