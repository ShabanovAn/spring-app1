package JavaCore.MyGneric;

public class ProgramGener {
    public static void main(String[] args) {
        Account<String> acc1 = new Account<>("222", 500);
        String accId = acc1.getId();
        System.out.println(accId);

        Account<Integer> acc2 = new Account<>(345, 600);
        Integer acc2Id = acc2.getId();
        System.out.println(acc2Id);
    }
}
interface AccountTable<T> {
    T getId();
    int getSum();
    void setSum(int sum);
}

class Account<T> implements AccountTable<T> {
    private T id;
    private int sun;

    public Account(T id, int sun) {
        this.id = id;
        this.sun = sun;
    }

    public T getId() {
        return id;
    }

    public int getSun() {
        return sun;
    }

    public void setSun(int sun) {
        this.sun = sun;
    }

    @Override
    public int getSum() {
        return 0;
    }

    @Override
    public void setSum(int sum) {

    }
}
