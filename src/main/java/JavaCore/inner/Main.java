package JavaCore.inner;

import org.stringtemplate.v4.ST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Driver;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Queue<String> queue = new LinkedList<>();
        Deque<String> deque = new LinkedList<>();
        ArrayDeque<String> strings = new ArrayDeque<>();
        strings.add("num 1");
        strings.add("num 3");
        strings.addLast("num 2");
        strings.addFirst("num 0");
        strings.push("num -1");
       // System.out.println(strings);

//        String stringsFirst = strings.getFirst();
//        System.out.println(stringsFirst);

        String stringLast = strings.getLast();
//        System.out.println(stringLast);
//
//        System.out.printf("Queue size: %d \n", strings.size());

//        while (strings.peek() != null) {
//            System.out.println(strings);
//
            ArrayDeque<Person> people = new ArrayDeque<>();
            people.addFirst(new Person("Person 1"));
            people.addFirst(new Person("Person 2"));
            for (Person person : people) {
                System.out.println(person.getName());

            }

        }
    }

        class Person {
            private String name;

            public Person(String value) {
                this.name = value;
            }

            public String getName() {
                return name;
            }

        }

//        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
//        int max = 0;
//        int N  = Integer.parseInt(b.readLine());
//
//        if (N > 0) {
//            for (int i = 0; i < N; i++) {
//                int A = Integer.parseInt(b.readLine());
//
//            }
//
//        }

