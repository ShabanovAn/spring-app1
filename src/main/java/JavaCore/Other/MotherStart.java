package JavaCore.Other;

public class MotherStart {
    public static void main(String[] args) {

        Mother mother = new Mother("Maria", 47);;
        Mother.Children children = mother.new Children("Tom", 15);
        Mother.MotherCapital motherCapital = new Mother.MotherCapital(1000);
        System.out.println(motherCapital.getSum());
        mother.setChildren(children);
        children.info();
        mother.info();
        new Mother().info(); //Анонимный класс

    }
}
