package JavaCore.MetanitClon;

import java.util.Objects;

public class AllMethodObject {
    public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {
        AllTests allTests = new AllTests("Tom", 22, 245678);
        AllTests allTests1 = (AllTests) allTests.clone();
        System.out.println(allTests1);

        Object o = new Object();
        Runnable runnable = () -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread = new Thread(runnable);
        thread.start();
        thread.wait();
        thread.notifyAll();

    }
}

class AllTests implements Cloneable {
    private String name;
    private int age;
    private int number;

    public AllTests(String name, int age, int number) {
        this.name = name;
        this.age = age;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AllTests allTests = (AllTests) o;
        return age == allTests.age &&
                number == allTests.number &&
                Objects.equals(name, allTests.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, number);
    }

    @Override
    public String toString() {
        return "AllTests{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", number=" + number +
                '}';
    }

    public AllTests() {
        super();
        System.out.println("Object");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        AllTests a = (AllTests) super.clone();
       // a.setName(a.);
        return a;


    }
}
