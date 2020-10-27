package JavaCore.MyStream.old;

public class StartClass {
    public static void main(String[] args) {
        Operation <Integer> operation = (x, y) -> x * y;
        System.out.println(operation.calculator(30, 20));

        MyInterface m = () -> {
            System.out.println("m print");
        };

        MyInterface myInterface = new MyInterface() {
            @Override
            public void test() {
                System.out.println("test2");
            }
        };

       m.test();
       myInterface.test();
       new ToTest().test();
    }
    static class ToTest implements MyInterface {

        @Override
        public void test() {
            System.out.println("Test print");
        }
    }
}
