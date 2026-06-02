package project2.main;


import java.util.*;

import project2.models.Driver;
import project2.models.Ride;
import project2.models.Rider;
import project2.service.RideService;
import project2.strategy.AutoFareStrategy;
import project2.strategy.BikeFareStrategy;
import project2.strategy.CabFareStrategy;
import project2.strategy.FareStrategy;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rider rider =
                new Rider(1,
                        "Dhinesh",
                        "8610659109");

        Driver d1 =
                new Driver(101,
                        "Karthick",
                        "9999999999");

        Driver d2 =
                new Driver(102,
                        "Vignesh",
                        "8888888888");

        List<Driver> drivers =
                new ArrayList<>();

        drivers.add(d1);
        drivers.add(d2);

        RideService rideService =
                new RideService(drivers);

        System.out.println("Pickup Location:");
        String pickup = sc.nextLine();

        System.out.println("Destination:");
        String destination = sc.nextLine();

        System.out.println("Distance (KM):");
        double distance = sc.nextDouble();

        sc.nextLine();

        System.out.println("Vehicle Type (Bike/Auto/Cab):");
        String vehicleType = sc.nextLine();

        FareStrategy strategy;

        switch (vehicleType.toLowerCase()) {

            case "bike":
                strategy = new BikeFareStrategy();
                break;

            case "auto":
                strategy = new AutoFareStrategy();
                break;

            default:
                strategy = new CabFareStrategy();
        }

        double fare =
                strategy.calculateFare(distance);

        Driver assignedDriver =
                rideService.assignDriver();

        if (assignedDriver == null) {

            System.out.println("No Drivers Available");
            return;
        }

        Ride ride =
                new Ride(
                        1,
                        rider,
                        assignedDriver,
                        pickup,
                        destination,
                        fare
                );

        System.out.println("\nDriver Assigned: "
                + assignedDriver.getName());

        ride.startRide();

        System.out.println("Ride Started...");

        ride.completeRide();

        System.out.println("Ride Completed...");

        System.out.println("\nPayment Successful");
        System.out.println("Amount Paid: ₹" + fare);

        System.out.println(ride);
    }
}