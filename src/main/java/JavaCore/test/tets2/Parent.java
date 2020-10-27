package JavaCore.test.tets2;
public class Parent {
    public String name = " Parent";
    void test() {
        System.out.println("parent");
    }
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent ss = new Child();
        parent.test();
        System.out.println(parent.name);

        child.test();
        System.out.println(child.name);

        ss.test();
        System.out.println(ss.name);
    }
}
class Child extends Parent {

    public Child() {
        super();
    }
    public String name = " Child";
    void test() {
        System.out.println("child");

    }
}
