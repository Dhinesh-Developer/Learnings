package Oops.Inheritance;

/*
Scenario

Swiggy has:
Veg restaurant
NonVeg restaurant
Both share common restaurant features
*/

class Resturant{
    String name;
    String address;

    Resturant(String name,String address){
        this.name = name;
        this.address = address;
    }

    void showDetails(){
        System.out.println("Restaurant: "+name);
        System.out.println("Address: "+address);
    }
}

class VegRestaurant extends Resturant{
    VegRestaurant(String name,String address){
        super(name, address);
    }
    
    void specialDish(){
        System.out.println("Special Dish : Panner Biryani");
    }
}

class NonVegRestuarnt extends Resturant{
    NonVegRestuarnt(String name,String address){
        super(name, address);
    }

    public void specialDish(){
        System.out.println("Special Dish : Mutton Briyani");
    }
}

public class InheritanceExample {
    public static void main(String[] args) {
        
        VegRestaurant veg = new VegRestaurant("Green Leaf", "Chennai");
        veg.showDetails();
        veg.specialDish();

        NonVegRestuarnt nonVeg = new NonVegRestuarnt("RR Briyani", "Salem");
        nonVeg.showDetails();
        nonVeg.specialDish();
    }   
}
/*
Restaurant: Green Leaf
Address: Chennai
Special Dish : Panner Biryani

Restaurant: RR Briyani
Address: Salem
Special Dish : Mutton Briyani
*/