package project2.strategy;

public class BikeFareStrategy implements FareStrategy{
    
    @Override
    public double calculateFare(double distance){
        return distance * 10;
    }
}
