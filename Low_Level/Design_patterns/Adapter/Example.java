package Low_Level.Design_patterns.Adapter;
/*
🧠 Scenario: Payment Gateway Integration

👉 Your system supports only PaymentProcessor
👉 But external library gives StripePayment

We need an adapter to connect them.
*/

interface PaymentProcessor{
    void pay(int amount);
}

class StripePayment{
    void makeStripePayment(int amount){
        System.out.println("Paid using Stripe: "+amount);
    }
}


class StripeAdapter implements PaymentProcessor{
    private StripePayment stripe = new StripePayment();

    public void pay(int amount){
        stripe.makeStripePayment(amount);
    }
}

public class Example {
    public static void main(String[] args) {
        PaymentProcessor payment = new StripeAdapter();
        payment.pay(1000);
    }
}
