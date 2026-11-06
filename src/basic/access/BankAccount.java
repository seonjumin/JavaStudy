package basic.access;
//캡슐화가 잘된 코딩
//외부에서 사용해야하는 기능만 풀어두고 나머지는 숨김.
public class BankAccount {

    //잔고를 건들면 안됨.
    private int balance;

    public BankAccount(){
        balance = 0;
    } //생략가능

    public void deposit(int amount){
        if(isAmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }

    }

    public void withdraw(int amount){
        if(isAmountValid(amount) && balance > amount){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance(){
        return balance;
    }
    //내부에서만 사용됨.
    private boolean isAmountValid(int amount){
        //금액이 0보다 크다
        return amount > 0;
    }

}
