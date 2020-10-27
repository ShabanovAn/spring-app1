package JavaCore.MyGneric.BarierGeneric;

public class BarierProgram1 {
    public static void main(String[] args) {
        Account1<String> acc1 = new Account1<>("12345", 4500);
        Account1<String> acc2 = new Account1<>("12324", 1500);
        Transaction1<Account1<String>> tran1 = new Transaction1<>(acc1, acc2, 4000);
        tran1.execute1();
        tran1 = new Transaction1<>(acc1, acc2, 4000);
        tran1.execute1();


    }
}
class Transaction1<T extends Account1<String>> {
    private T from;  // с какого счета перевод
    private T to; // на какой счет перевод
    private int sum; // сумма перевода

    public Transaction1(T from, T to, int sum) {
        this.from = from;
        this.to = to;
        this.sum = sum;
    }

    public void execute1() {
        if (from.getSum() > sum) {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum); System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(), to.getId(), to.getSum());

        }else {
            System.out.printf("Operation is valid");
        }
    }
}

class Account1<T> {
    private T id;
    private int sum;

    public Account1(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}