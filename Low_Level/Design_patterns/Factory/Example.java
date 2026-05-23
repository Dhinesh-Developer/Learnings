package Low_Level.Design_patterns.Factory;

interface PaymentGateway{
    void createPayment();
}

class CreditCardPayment implements PaymentGateway{

    private String amount = "5000";

    public void createPayment(){
        System.out.println("CreditCardPayment success! " +amount);
    }
}

class GPay implements PaymentGateway{

    private String amount = "6000";

    public void createPayment(){
        System.out.println("Gpay Payment success! " + amount);
    }
}

class PaymentFactory{
    public static PaymentGateway getPaymentType(String type){
        if(type.equalsIgnoreCase("credidcard")){
            return new CreditCardPayment();
        }else if(type.equalsIgnoreCase("gpay")){
            return new GPay();
        }
        return null;
    }
}

public class Example {
    public static void main(String[] args) {
        
        PaymentGateway gateway = PaymentFactory.getPaymentType("gpay");
        gateway.createPayment();
    }
}
