package project2.strategy;

public class AutoFareStrategy implements FareStrategy{
    
    @Override
    public double calculateFare(double distance){
        return distance * 15;
    }
}
