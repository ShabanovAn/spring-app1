package JavaCore.vidio;

public class Program {

    public static void fire(Object sender) {
        System.out.println("Fire!!!!!!!");
    }

    public static void main(String[] args) {
        Swither sw = new Swither();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

       sw.addElectricityListener(lamp);
       sw.addElectricityListener(radio);

       String message = "Пожарная";

       sw.addElectricityListener(
               new ElectricityConsumer()
               {
           public void electricityOn(Object sender) {
               System.out.print(message);
               System.out.println("!!!!!!");
           }
       });

       sw.addElectricityListener(sender-> System.out.println(message));
        sw.addElectricityListener(s -> Program.fire(s));
        sw.addElectricityListener(Program::fire);

        sw.switchON();

    }
}
