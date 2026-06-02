package project2.strategy;

public class CabFareStrategy implements FareStrategy{
    
    @Override
    public double calculateFare(double distance){
        return distance * 20;
    }
}
