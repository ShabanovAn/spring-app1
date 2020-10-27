package JavaCore.MyGneric.BarierGeneric;

public class BarierProgram {
    public static void main(String[] args) {
        Account account = new Account("12345", 4500);
        Account account1 = new Account("2111", 9000);
        Transaction<Account> transaction =
                new Transaction<>(account, account1, 5000);
        transaction.execute();
        transaction = new Transaction<>(account, account1, 4000);
        transaction.execute();
    }
}
class Transaction <T extends Account> {
    private T from; // с какого счета перевод
    private T to;  // на какой счет перевод
    private int sum;  // сумма перевода

    public Transaction(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(), to.getId(), to.getSum());
        }
        else {
            System.out.println("Operation is invalid");
        }
    }
}

class Account {
    private String id;
    private int sum;

    public Account(String id, int sum) {
        this.id = id;
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
