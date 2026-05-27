package Oops.Encapsulation;

// Scenario : in banking apps, balance should not be directly modified

class ATMAccount{
    private double balance;

    public ATMAccount(double balance){
        this.balance = balance;
    }

    // setter with validation
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println(amount+" deposited!!!");
        }else{
            System.out.println("Invalid Amount");
        }
    }

    public double getBalance(){
        return balance;
    }

    

}
public class EncapsulationExample {
    public static void main(String[] args) {
        
        ATMAccount account = new ATMAccount(1000);
        account.deposit(500);

        System.out.println("Final Balance: "+account.getBalance());
    }
}
/*
500.0 deposited!!!
Final Balance: 1500.0
*/