package JavaCore.comparable;

import java.util.Comparator;

public class Users {
    String name;
    int phoneNumber;
    int age;

    public Users(String name, int phoneNumber, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", age=" + age +
                '}';
    }
}


