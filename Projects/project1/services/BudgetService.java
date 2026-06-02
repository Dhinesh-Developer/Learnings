package project1.services;

public class BudgetService {
    
    public void analyzeBudget(double Budget,double expense){
        System.out.println("Budget: "+Budget);
        System.out.println("Expense: "+expense);

        if(expense > Budget){
            System.out.println("Budget exceeded!");
            System.out.println("Exceeded Amount: "+(expense-Budget));
        }else{
            System.out.println("Remaining Budget: "+(Budget-expense));
        }
    }
}
