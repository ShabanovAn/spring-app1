package JavaCore.MyGneric.BaseClass;

public class Test {
    public static void main(String[] args) {
        DepositAccount<Integer, String> depositAccount =new DepositAccount(20, "tom");
        System.out.println(depositAccount.get_id() + " : " +depositAccount.get_name());

        DepositAccount<String, Integer> depositAccount1 = new DepositAccount("12323", 23434);
        System.out.println(depositAccount1.get_id() + " : " + depositAccount1.get_name());
    }
}
class NewAccount<T> {
    private T _id;

    public T get_id() {
        return _id;
    }

    public NewAccount(T _id) {
        this._id = _id;
    }
}
class DepositAccount<T, S> extends NewAccount<T> {
    private S _name;

    public S get_name() {
        return _name;
    }

    public DepositAccount(T _id, S name) {
        super(_id);
        this._name = name;
    }
}