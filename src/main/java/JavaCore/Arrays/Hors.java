package JavaCore.Arrays;

import java.util.Objects;

public class Hors {
    private String name;
    private int age;

    public Hors(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "Hors{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
