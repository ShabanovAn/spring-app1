package JavaCore.MyGneric;

public class MyProgramGenericTest {
    public static void main(String[] args) {
        AccountUser<String, Double> acc1 = new AccountUser<>("123", 4000.78);
        String idUser = acc1.getId();
        Double sumUser = acc1.getSum();
        System.out.printf("id: %s sum: %f \n", idUser, sumUser);


    }
}

class AccountUser<T, S> {
    private T id;
    private S sum;

    public AccountUser(T id, S sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public S getSum() {
        return sum;
    }

    public void setSum(S sum) {
        this.sum = sum;
    }
}