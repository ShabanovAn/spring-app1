package JavaCore.LambdaTest.functionalInterface;

import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        Voice voice = () -> System.out.println("Hello World");
        voice.speak();

        Voice voice1 = Human::staticRun;
        voice1.speak();

        Human human = new Human();
        Voice voice2 = human::run;
        voice2.speak();

        Model model = x -> Integer.valueOf(x);
        System.out.println(100 + model.get("10"));

        Model model1 = Integer::valueOf;
        System.out.println(100 + model1.get("15"));

        Model model2 = human::toInteger;
        System.out.println(model2.get("50") + 100);

        Function<String, Integer> function = human::toInteger;
        System.out.println(function.apply("200") + 200);

    }
}

interface Model {
    int get(String nub);
}


class Human {
    void run() {
        System.out.println("Simple method");
    }

    static void staticRun() {
        System.out.println("Static Method");
    }

    int toInteger(String s){
        return Integer.valueOf(s);
    }

}
