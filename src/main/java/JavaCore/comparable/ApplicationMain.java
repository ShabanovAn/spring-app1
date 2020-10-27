package JavaCore.comparable;

import java.util.*;

public class ApplicationMain {

    public enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY

    }

    public DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek(DayOfWeek dayOfWeek) {
        return dayOfWeek;
    }


    public static void main(String[] args) {

        List<String> arrayList = new ArrayList<>();
        List<Integer> arrayList1 = new ArrayList<>();
        List<String> list = new LinkedList<>();

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        // Set<Users> enumSet = new EnumSet<>();

        Map<Integer, String> threeMap = new TreeMap<>();
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> identityHashMap = new IdentityHashMap<>();
        Map<Integer, String> weakHashMap = new WeakHashMap<>();
        // Map<Integer, Users> abstractMap = new AbstractMap<Integer, Users>() {}
        //Map<Integer, Users> enumMap = new EnumMap<>();

        System.out.println("=========>ArrayList<=========");
        arrayList.add("arrayList10");
        arrayList.add("arrayList1020");
        arrayList.add("arrayList505050");
        arrayList.remove(0);
        arrayList.add(0,"new elemnt");
        arrayList.remove(1);
        arrayList.add(1, "element 2");
        System.out.println(arrayList);
//        System.out.println("=========>ArrayList sorted stream<=========");
//        arrayList.stream()
//                .filter(i -> i.length() == 11 )
//                .forEach(System.out::println );
        System.out.println(" ");
//        System.out.println(arrayList);
//        System.out.println(" ");

        arrayList1.add(10);arrayList1.add(55);arrayList1.add(2999);arrayList1.add(600);arrayList1.add(15);arrayList1.add(30);
        //arrayList1.stream().forEach(i -> );

        System.out.println("=========>List<=========");
        list.add("list1");list.add("list2");list.add("list3");


        System.out.println(list);
        System.out.println(" ");

        System.out.println("=========>LinkedHashSet<=========");
        linkedHashSet.add(1);
        linkedHashSet.add(2);
        linkedHashSet.add(2);
        linkedHashSet.add(3);
        System.out.println(linkedHashSet);
        System.out.println(" ");

        System.out.println("===>HashSet<===");
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);
        System.out.println(hashSet);
        System.out.println(" ");

        System.out.println("===>TreeSet<===");
        treeSet.add(1);
        treeSet.add(2);
        treeSet.add(2);
        treeSet.add(3);
        System.out.println(treeSet);
        System.out.println(" ");

        System.out.println("===>TreeMap<===");
        threeMap.put(1, "treeMap1");
        threeMap.put(2, "treeMap2");
        threeMap.put(3, "treeMap3");
        System.out.println(threeMap);
        System.out.println(" ");

        System.out.println("===>HashMap<===");
        hashMap.put(1, "hashMap1");
        hashMap.put(2, "hashMap2");
        hashMap.put(3, "hashMap3");
        System.out.println(hashMap);
        System.out.println(" ");

        System.out.println("===>LinkedHashMap<===");
        linkedHashMap.put(1,"linkedHashMap1");
        linkedHashMap.put(2,"linkedHashMap2");
        linkedHashMap.put(3,"linkedHashMap3");
        System.out.println(linkedHashMap);
        System.out.println(" ");

        System.out.println("===>IdentityHashMap<===");
        identityHashMap.put(1,"identityHashMap1");
        identityHashMap.put(2,"identityHashMap2");
        identityHashMap.put(3,"identityHashMap3");
        System.out.println(identityHashMap);
        System.out.println(" ");

        System.out.println("===>weakHashMap<===");
        weakHashMap.put(1, "weakHashMap1");
        weakHashMap.put(2, "weakHashMap2");
        weakHashMap.put(3, "weakHashMap3");
        System.out.println(weakHashMap);
        System.out.println(" ");











    }
}
