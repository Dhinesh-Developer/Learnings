package Low_Level.Design_patterns.Decorater;

interface Coffee{
    int cost();
}

class SimpleCoffee implements Coffee{
    public int cost(){
        return 10;
    }
}

class MilkDecorater implements Coffee{
    Coffee coffee;

    MilkDecorater(Coffee coffee){
        this.coffee = coffee;
    }

    public int cost(){
        return coffee.cost()+5;
    }
}

public class DecorateDemo {
    public static void main(String[] args) {
        Coffee coffee = new MilkDecorater(new SimpleCoffee());
        System.out.println(coffee.cost());
    }
}
