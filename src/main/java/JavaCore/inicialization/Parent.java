package JavaCore.inicialization;
// Порядок инициализации класса
public class Parent {
    public static int v = 0; //1

    static {
        System.out.println("Static block Parent"); //2
    }

    {
        System.out.println("Non static block Parent"); //4
    }

    public int i = 0; //3

    public Parent() {
        System.out.println("Constructor Parent"); //5
    }
}
