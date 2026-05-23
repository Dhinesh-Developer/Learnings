package Low_Level.Design_patterns.Decorater;

interface Food{
    int price();
    String description();
}

class Burger implements Food{

    public int price(){
        return 50;
    }

    public String description(){
        return "Burger";
    }
}

class CheeseDecorater implements Food{
    Food food;

    CheeseDecorater(Food food){
        this.food = food;
    }

    public int price(){
        return food.price()+20;
    }

    public String description(){
        return food.description()+" + cheese";
    }
}

class FriesDecorated implements Food{

    Food food;

    FriesDecorated(Food food){
        this.food = food;
    }

    public int price(){
        return price()+30;
    }

    public String description(){
        return food.description()+" +Fries";
    }
}

public class Example {
    public static void main(String[] args) {
        
        Food order = new Burger();

        order = new CheeseDecorater(order);
        order = new FriesDecorated(order);

        System.out.println(order.description());
      System.out.println("Total price: "+ order.price()) ; 
    }
}
