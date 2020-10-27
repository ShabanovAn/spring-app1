package JavaCore.LambdaTest.functionLambda.Supplier;

import java.util.Scanner;
import java.util.function.Supplier;

public class LambdaApp {
    public static void main(String[] args) {
//        Supplier<User> userFuctoru = ()-> {
//            Scanner in = new Scanner(System.in);
//            System.out.println("Введите имя: ");
//            String name = in.nextLine();
//            return new User(name);
//        };
//        User user1 = userFuctoru.get();
//        User user2 = userFuctoru.get();
//        System.out.println("Name user1 : " + user1.getName());
//        System.out.println("Name user2 : " + user2.getName());

        Supplier<String>  supplier = NewSupplier::get;
        System.out.println(supplier.get());

        NewSupplier newSupplier = new NewSupplier();
        Supplier<String> supplier1 = newSupplier::get1;
        System.out.println(supplier1.get());


    }
}
class NewSupplier  {
    static String get() {
        return "Supplier";
    }

    String get1() {
        return "Not Static supplier";
    }

}
 class User {
    private String name;

     public String getName() {
         return name;
     }

     public User(String name) {

         this.name = name;
     }
 }
