package JavaCore.test;

public class Main1 {

    static class Parent {
        void test() {
            System.out.println("parent::test()");
        }
    }

    static class Child extends Parent {
        @Override
        void test() {
            System.out.println("child::test()");
        }
    }

    static void use(Parent item) {
        System.out.println("use::parent");
        item.test();
    }

    static void use(Child item) {
        System.out.println("use::child");
        item.test();
    }

    public static void main(String[] args) {
        Parent item = new Child();
        use(item);
    }
}