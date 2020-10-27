package JavaCore.hashmap;

import test.multitread.Cat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Application {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        Bird bird2 = new Bird();
        Bird bird3 = new Bird();

        bird1.setName("Kesha");
        bird1.setAge(22);

        bird2.setName("Grisha");
        bird2.setAge(15);

        bird3.setName("Mitia");
        bird3.setAge(10);


        HashMap<String, Bird> map = new HashMap<>();
        map.put("Kesha",bird1);
        map.put("Grisha",bird2);
//        map.put("key2",bird2);

        //System.out.println(map.get("name"));
        for (Map.Entry entry : map.entrySet()) {
            System.out.println(entry);

        }

        System.out.println("------------------------------");

        Bird[] birds  = {bird1, bird2, bird3};
        for (Bird bird : birds) {
            System.out.println(bird);
        }


       // map.get("key1");
        System.out.println("_________________________________");

        System.out.println(map.get("Kesha"));

        System.out.println(birds[1]);


    }
}
