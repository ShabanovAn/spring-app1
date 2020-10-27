package JavaCore.MyStream.MetanitStream.Filter;

import java.util.stream.Stream;

public class Filter {
    public static void main(String[] args) {
//        Stream<String> citiStream = Stream.of("Париж", "Лондон", "Мадрид","Берлин", "Брюссель");
//        citiStream.filter(s -> s.length() == 6).forEach(System.out::println);


        Stream<Phone> phoneStream = Stream.of(new Phone("iPhone 6 S", 54000), new Phone("Lumia 950", 45000),
                new Phone("Samsung Galaxy S 6", 40000));
//        phoneStream.filter(s -> s.getPrice()> 50000).forEach(phone -> System.out.println(phone.getPrice() + phone.getName()));


//        phoneStream1.map(p -> p.getName())
//                .forEach(System.out::println);

//        phoneStream.map(p -> "название : " + p.getName() + " цена " + p.getPrice())
//                .forEach(System.out::println);

phoneStream
        .flatMap(p -> Stream.of(
                String.format("название : %S  цена без скидки : %d",p.getName(), p.getPrice()),
                String.format("название : %S  цена co скидкой : %d", p.getName(),p.getPrice()-(int) (p.getPrice() * 0.1))
        ))
        .forEach(System.out::println);

    }
}

class Phone {
    private String name;
    private int price;

    public Phone(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

