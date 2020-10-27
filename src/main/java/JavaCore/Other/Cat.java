package JavaCore.Other;

public class Cat implements Animal{
    private String name;
    private int weight;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //    @Override
//    public void brief() {
//        System.out.println("Дышит");
//    }

    @Override
    public void voice() {
        System.out.println("Мяу");

    }
}
