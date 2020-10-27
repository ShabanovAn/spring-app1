package JavaCore.MetanitClon;

import java.util.*;

// Создать и переопределить все методы класса Object
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        List<String> strings = new ArrayList<>();
        Set<String> stringSet = new HashSet<>();

        Password password = new Password("password");
        Password password1 = new Password("password1 for person1");
        Person person = new Person("Tom", 30, password);
        System.out.println(person);
        Person person1 = person.clone();
        // person1.setName("Bob");
        person.setPassword(password1);

        System.out.println(person.getPassword().getNumber());
        System.out.println(person1.getPassword().getNumber());

        System.out.println(person1.hashCode());
        System.out.println(person.hashCode());

        System.out.println(person1.equals(person));


    }
}

class Person implements Cloneable {
    String name;
    int age;
    Password password;

    public Password getPassword() {
        return password;
    }

    public void setPassword(Password password) {
        this.password = password;
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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(String name, int age, Password password) {
        this.name = name;
        this.age = age;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    // метод Clone по умолчанию делает поверхностную копию
    // (вложенные объекты не копируются а просто передается ссылка на вложенный обьект)

    // переопределенный метод Clone делает глубокое копирование
    // (вложенные обькты клонируются для них создаются новые ячейки памяти)
    @Override
    protected Person clone() throws CloneNotSupportedException {
        Person person = (Person) super.clone();
        // person.setPassword(password.clone());
        return person;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
        // Objects.equals(password, person.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

class Password implements Cloneable {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Password(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Password{" +
                "number='" + number + '\'' +
                '}';
    }

    @Override
    protected Password clone() throws CloneNotSupportedException {
        return (Password) super.clone();
    }
}
