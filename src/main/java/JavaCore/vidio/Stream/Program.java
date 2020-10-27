package JavaCore.vidio.Stream;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) throws InterruptedException {

        List<Person> person = new ArrayList<>();
        person.add(new Person("Andrey", 30));
        person.add(new Person("Dmitriy", 25));
        person.add(new Person("Petia", 17));
        person.add(new Person("Sveta", 16));
        person.add(new Person("Boris", 26));

        int sum = 0;
        int adultPersons = 0;
        for (Person p : person)
            if (p.getAge() >= 18) {
                sum += p.getAge();
                adultPersons++;
            }
        double averageAge = (double) sum / adultPersons;
        System.out.println("Standartio sorting");
        System.out.println(averageAge);
        System.out.println();


        System.out.println("Stream sorting");
        double averageAge2 = person.stream()
                .filter(r -> r.getAge() >= 18)
                .mapToInt(r -> r.getAge())
                .average()
                .getAsDouble();
        System.out.println(averageAge2);

    }


//     for (Person p : person) {System.out.println(p);}
//     person.stream().forEach( p -> System.out.println(p));
//     person.stream().forEach(System.out::println);
//    person.forEach(System.out::println);
//
//        person.stream()
//                .filter(p -> p.getAge() >=18)
//                .sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
//                .map(p -> p.getName())
//                .forEach(System.out::println);


}



