package JavaCore.LambdaTest;

public class LambdaApp8 {
    public static void main(String[] args) {
        UserBuilder userBuilder = User::new;
        User user = userBuilder.create("Tom");
        System.out.println(user.getName());

    }
}

interface UserBuilder {
    User create(String name);

}

class User {
    private String name;


    String getName() {
        return name;
    }

    User(String name) {
        this.name = name;
    }
}
