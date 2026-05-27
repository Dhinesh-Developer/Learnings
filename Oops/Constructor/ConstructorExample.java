package Oops;

// scenario : when a user creates a bank accounts, details should initialize immediately

class BankAccount{

    int accountNumber;
    String holderName;
    double balance;

    public BankAccount(int accountNumber,String holderName,double balance){
        this.accountNumber =accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Holder Name : "+holderName);
        System.out.println("Account Balance: "+balance);
    }
}

public class ConstructorExample {
    public static void main(String[] args) {
        
        BankAccount user1 = new BankAccount(101, "kumar", 100000000);
        user1.display();

        BankAccount user2 = new BankAccount(102, "Dhinesh", 100000);
        user2.display();
    }
}
/*
Account Number: 101
Account Holder Name : kumar
Account Balance: 1.0E8
Account Number: 102
Account Holder Name : Dhinesh
Account Balance: 100000.0
*/