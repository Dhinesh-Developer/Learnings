package project2.models;

import project2.enums.RideStatus;

public class Ride {

    private int rideId;
    private Rider rider;
    private Driver driver;
    private String pickup;
    private String destination;
    private double fare;
    private RideStatus status;

    public Ride(int rideId,
                Rider rider,
                Driver driver,
                String pickup,
                String destination,
                double fare) {

        this.rideId = rideId;
        this.rider = rider;
        this.driver = driver;
        this.pickup = pickup;
        this.destination = destination;
        this.fare = fare;

        this.status = RideStatus.REQUESTED;
    }

    public void startRide() {
        status = RideStatus.STARTED;
    }

    public void completeRide() {
        status = RideStatus.COMPLETED;
        driver.setAvailable(true);
    }

    public double getFare() {
        return fare;
    }

    @Override
    public String toString() {

        return "\nRide ID: " + rideId +
                "\nRider: " + rider.getName() +
                "\nDriver: " + driver.getName() +
                "\nPickup: " + pickup +
                "\nDestination: " + destination +
                "\nFare: ₹" + fare +
                "\nStatus: " + status;
    }
}