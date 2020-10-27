package JavaCore.Other;

//
////static пренадлежит классу и сущетвует в единственном экземпляре,
//// статический метод обращается к статическим полям
//public static int raund(Model model) {
//        return model.number(5);
//        }

public class Main {
    public static void main(String[] args) {
        Model model = Car::a;
        System.out.println(model.number(4));

        Model model1 = Car::b;
        System.out.println(model1.number(4));

        Model model2 = (x)->x%2;
        System.out.println(model2.number(4));

        Model model3 = new Model() {
            @Override
            public int number(int num) {
                return num*3;
            }
        };
    }

}

class Car{
    static int a(int a){
        return a * 10;
    }
    static int b(int b) {
        return b + 100;
    }
}
