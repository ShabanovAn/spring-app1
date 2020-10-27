package JavaCore.test;

import java.util.ArrayList;
import java.util.List;
public class Main {

static class Parent {
    void test() {
        System.out.println("parent::test()");
    }

    void testParent() {
        System.out.println("parent::testParent");
    }
}

static class Child extends Parent {
    @Override
    void test() {
        System.out.println("child::test");
    }

    void testChild() {
        System.out.println("child::testParent()");
    }
}
    public static void main(String[] args) {
        Parent item = new Child();
        System.out.println("=====>Parent -> Child <=====");

        item.test();
        item.testParent();
        System.out.println();
        System.out.println("=====> Child -> Child <=====");
        Child other = new Child();
        other.test();
        other.testChild();
        other.testParent();
        System.out.println();
        System.out.println("======Collection=====");
        List<Parent> list = new ArrayList<>();
        list.add(new Child());
        list.add(new Parent());
        for (Parent parent : list) {
            parent.test();

        }
    }

}



