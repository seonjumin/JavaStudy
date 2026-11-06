package basic.oop1.ex;

public class Account {
    int balance;
    void deposit(int amount){
        balance += amount;
        System.out.println("잔액: "+ balance);
    }
    void withdraw(int amount){
        if(balance >= amount){
            balance -= amount;
            System.out.println("잔액: "+ balance);
        }else{
            System.out.println("잔액 부족");
        }
    }
    void printBalance(){
        System.out.println("잔고: "+ balance);
    }
}
