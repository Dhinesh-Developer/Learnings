package Low_Level.Design_patterns.Factory;

interface Vehicle{
    void drive();
}

class Car implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Driving Car!");
    }
}

class Bike implements Vehicle{
    @Override
    public void drive(){
        System.out.println("Driving Bike!");
    }
}

class VehicleFactory{
    public static Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("car")){
            return new Car();
        }else if(type.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return null;
    }
}


public class FactoryDemo {
    public static void main(String[] args) {
        
        Vehicle vehicle = VehicleFactory.getVehicle("Car");
        vehicle.drive();

        // Vehicle vehicle = VehicleFactory.getVehicle("bike");
        // vehicle.drive();
    }
}
