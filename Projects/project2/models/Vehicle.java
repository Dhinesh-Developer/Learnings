package project2.models;

public class Vehicle {
    
    private String vehicleType;
    private String vehicleNumber;

    public String getVehicleType() {
        return vehicleType;
    }
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public Vehicle(String vehicleType, String vehicleNumber) {
        this.vehicleType = vehicleType;
        this.vehicleNumber = vehicleNumber;
    }
    @Override
    public String toString() {
        return "Vehicle [vehicleType=" + vehicleType + ", vehicleNumber=" + vehicleNumber + "]";
    }

    
}
