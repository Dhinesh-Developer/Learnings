package Low_Level.Design_patterns.Strategy;

interface PaymentStrategy{
    void pay(int amount);
}

class UPI implements PaymentStrategy{
    @Override
    public void pay(int amount){
        System.out.println("Paid Via UPI: "+amount);
    }
}

class CreditCard implements PaymentStrategy{

    @Override
    public void pay(int amount){
        System.out.println("Paid Via CreditCard: "+amount);
    }
}

class PaymentContext{

    private PaymentStrategy strategy;

    public PaymentContext(PaymentStrategy strategy){
        this.strategy = strategy;
    }

    public void executePayment(int amount){
        strategy.pay(amount);
    }
}


public class StrategyDemo {
    public static void main(String[] args) {
        
        PaymentContext context = new PaymentContext(new UPI());
        context.executePayment(10000);
    }
}
