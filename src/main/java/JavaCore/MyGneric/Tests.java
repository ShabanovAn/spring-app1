package JavaCore.MyGneric;

public class Tests {
    public static void main(String[] args) {

        Accountable123<String> acc1 = new Account123("1235rwr", 5000);
       // Accountable123<Integer> ss = new Account123("sdsd", 2332);
        Account123 acc2 = new Account123("2373", 4300);
        //Account123 acc3 = new Account123(432, 4300);

        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
    }
}
interface Accountable123<T>{
    T getId();
    int getSum();
    void setSum(int sum);
}
class Account123 implements Accountable123<String>{

    private String id;
    private int sum;

    Account123(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}

