package project1.models;

public class Expense {
    
    private int expenseId;
    private double amount;
    private Category category;
    private String description;
    private User user;

    
    public int getExpenseId() {
        return expenseId;
    }
    public void setExpenseId(int expenseId) {
        this.expenseId = expenseId;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Expense(int expenseId, double amount, Category category, String description, User user) {
        this.expenseId = expenseId;
        this.amount = amount;
        this.category = category;
        this.description = description;
        this.user = user;
    }
    @Override
    public String toString() {
        return "Expense [expenseId=" + expenseId + ", amount=" + amount + ", category=" + category + ", description="
                + description + ", user=" + user + "]";
    }
    public Expense() {
    }

    
}
