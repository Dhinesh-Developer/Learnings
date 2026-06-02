package project1.services;

import java.util.ArrayList;
import java.util.List;

import project1.models.Expense;
import project1.models.User;

public class ExpenseService {

    private List<Expense> expenses = new ArrayList<>();
    

    public void addExpense(Expense expense){
        expenses.add(expense);
        System.out.println("Expense added succesfully!!");
    }

    public void viewExpense(User user){
        for(Expense x : expenses){
            if(x.getUser() == user){
                System.out.println(x);
            }
        }
    }

    public double calculateTotal(User user){
        double total = 0;
        for(Expense x : expenses){
            if(x.getUser() == user){
                total += x.getAmount();
            }
        }
        return total;
    }

    public void categoryReport(User user){
        double food = 0;
        double travel = 0;
        double shopping = 0;

        for(Expense x : expenses){
            if(x.getUser() == user){
                String category = x.getCategory().getCategoryName();
                if(category.equalsIgnoreCase("food")){
                    food += x.getAmount();
                }else if(category.equalsIgnoreCase("travel")){
                    travel += x.getAmount();
                }else if(category.equalsIgnoreCase("shopping")){
                    shopping += x.getAmount();
                }
            }
        }

        System.out.println("Food: "+food);
        System.out.println("Travel: "+travel);
        System.out.println("Shopping: "+shopping);
    }

}
