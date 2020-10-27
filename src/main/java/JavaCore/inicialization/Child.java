package JavaCore.inicialization;

public class Child extends Parent {
    public static int v = 0;

    static {
        System.out.println("Static block Child");
    }

    {
        System.out.println("Non static block Child");
    }

    public int i = 0;

    public Child() {
        System.out.println("Constructor Child");
    }
}
