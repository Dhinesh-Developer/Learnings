package Oops.Polymorphism;

/*
Different payment methods process payment differently.

Same method:
pay()

Different behavior:
UPI/Card/Cash
*/

class Payment{
    void pay(){
        System.out.println("Processing Payment");
    }
}

class UPI extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment Via UPI!!");
    }
}

class CreditCard extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment Via Credit Card!!");
    }
}

class Cash extends Payment{

    @Override
    public void pay(){
        System.out.println("Payment Via Cash!!");
    }
}

public class PolymorphismExample {
   public static void main(String[] args) {

    Payment payment1 = new UPI();
    Payment payment2 = new CreditCard();
    Payment payment3 = new Cash();

    payment1.pay();
    payment2.pay();;
    payment3.pay();


   } 
}

/*
Payment Via UPI!!
Payment Via Credit Card!!
Payment Via Cash!!
*/