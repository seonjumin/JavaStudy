package basic.access;

public class BankAccountMain {

    public static void main(String[] args){
        BankAccount account = new BankAccount();
        account.deposit(-10000);
        account.withdraw(8000);
        System.out.println("balance : " + account.getBalance());
    }
}
