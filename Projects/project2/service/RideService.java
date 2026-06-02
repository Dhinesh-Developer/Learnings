package project2.service;

import java.util.List;

import project2.models.Driver;

public class RideService {

    private List<Driver> drivers;

    public RideService(List<Driver> drivers) {
        this.drivers = drivers;
    }

    public Driver assignDriver() {

        Driver bestDriver = null;

        for (Driver driver : drivers) {

            if (driver.isAvailable()) {

                if (bestDriver == null ||
                        driver.getRating() > bestDriver.getRating()) {

                    bestDriver = driver;
                }
            }
        }

        if (bestDriver != null) {
            bestDriver.setAvailable(false);
        }

        return bestDriver;
    }
}

