package JavaCore.MyGneric.BarierGeneric;

public class InterfaceBarier {
    public static void main(String[] args) {
        AccountZ accountZ = new AccountZ("213223", 600);
        AccountZ accountZ2 = new AccountZ("223", 400);
        TransactionNew<AccountZ> tran = new TransactionNew<>(accountZ, accountZ2, 500);
        tran.execute();
    }
}

interface AccountableZ {
    String getId();
    int getSum1();
    void setSum1(int sum);

}

class AccountZ implements AccountableZ {
    private String id;
    private int sum;

    public AccountZ(String id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public int getSum1() {
        return 0;
    }

    @Override
    public void setSum1(int sum) {

    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
class TransactionNew<T extends AccountableZ> {
    private T from;  // с какого счета перевод
    private T to; // на какой счет перевод
    private int sum; // сумма перевода

    public TransactionNew(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute() {
        if(from.getSum1() > sum) {
            from.setSum1(from.getSum1() - sum);
            to.setSum1(to.getSum1() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum1(), to.getId(), to.getSum1());
        }
        else  {
            System.out.println("Operation is valid");
        }
    }
}
