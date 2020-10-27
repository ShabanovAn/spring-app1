package JavaCore.MyGneric;

public class ConstructorGeneric {
    public static void main(String[] args) {
        AccountNew accountNew = new AccountNew("cid212", 4000);
        AccountNew accountNew1 = new AccountNew(4543, 12112);
        System.out.println(accountNew.getId());
        System.out.println(accountNew1.getId());

    }
}

class AccountNew {
    private String id;
    private int sum;

    <T>AccountNew(T id, int sum) {
        this.id = id.toString();
        this.sum = sum;
    }

    public String getId() {
        return id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
