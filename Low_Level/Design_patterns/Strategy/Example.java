package Low_Level.Design_patterns.Strategy;

interface ShippingStrategy{
    int calculateCost();
}

class FedxStrategy implements ShippingStrategy{
    @Override
    public int calculateCost(){
        return 10000;
    }
}

class UPSstarategy implements ShippingStrategy{
    @Override
    public int calculateCost(){
        return 5000;
    }
}

class ShippingContext{
    private ShippingStrategy strategy;

    public ShippingContext(ShippingStrategy strategy){
        this.strategy = strategy;
    }

    public void executeShippingProcess(){
        System.out.println("Shipping Amount: "+strategy.calculateCost());
    }
}

public class Example {
    public static void main(String[] args) {
        
        ShippingContext context = new ShippingContext(new UPSstarategy());
        context.executeShippingProcess();
    }
}
