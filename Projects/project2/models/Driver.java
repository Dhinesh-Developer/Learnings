package project2.models;

public class Driver extends User {

    private boolean available;
    private double rating;

    public Driver(int id, String name, String phone) {
        super(id, name, phone);
        this.available = true;
        this.rating = 5.0;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public double getRating() {
        return rating;
    }
}
