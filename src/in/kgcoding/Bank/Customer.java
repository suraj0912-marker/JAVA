package in.kgcoding.Bank;

public class Customer {
    public static void main(String[] args) {
        BankAccount account=new BankAccount("001","SurajBehra");
        account.depositmoney(100);
        System.out.println(account.withdrarmoney(200));
        account.depositmoney(-40);
        account.withdrarmoney(0);

    }
}
