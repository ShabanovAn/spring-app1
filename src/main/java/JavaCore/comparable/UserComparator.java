package JavaCore.comparable;

import java.util.Comparator;

public class UserComparator implements Comparator<Users> {

    @Override
    public int compare(Users o1, Users o2) {
        return o1.age - o2.age;
    }

    public int newComparator(Users o1, Users o2) {
        return o1.getAge() + o2.getAge();
    }
}
