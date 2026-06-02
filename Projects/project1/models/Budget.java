package project1.models;

public class Budget {
    
    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public Budget(double limit) {
        this.limit = limit;
    }

    public Budget() {
    }

    @Override
    public String toString() {
        return "Budget [limit=" + limit + "]";
    }

    
}
