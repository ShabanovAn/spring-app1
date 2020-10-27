package JavaCore.MyStream.old;

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class Human {
    public static void main(String[] args) {
        List<Piople> pioples = asList(
                new Piople("Sam", asList("Baddy", "Lacy")),
                new Piople("Bob", asList("Frankie", "Rosie")),
                new Piople("Maria", asList("Simba", "Tilly")));


        List<String> petNAmes = pioples.stream()
                .flatMap(human -> human.getPets().stream())
                .collect(Collectors.toList());
        System.out.println(petNAmes);

//        List<String> petNames = pioples.stream()
//                .map(piple -> piple.getPets())//преобразовываем Stream<Human> в Stream<List<Pet>>
//                .flatMap(pets -> pets.stream())//"разворачиваем" Stream<List<Pet>> в Stream<Pet>
//                .collect(Collectors.toList());
//        System.out.println(petNames);

//        List<String> petNames = new ArrayList<>();
//        for (Piople piople : pioples) {
//            petNames.addAll(piople.getPets());
//        }
//        System.out.println(petNames);

    }
}

class Piople {
    private final String name;
    private final List<String> pets;

    public Piople(String name, List<String> pets) {
        this.name = name;
        this.pets = pets;
    }

    public String getName() {
        return name;
    }

    public List<String> getPets() {
        return pets;
    }
}
