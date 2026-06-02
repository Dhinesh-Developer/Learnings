package project1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import project1.models.Budget;
import project1.models.Category;
import project1.models.Expense;
import project1.models.User;
import project1.services.BudgetService;
import project1.services.ExpenseService;
import project1.services.UserService;

public class Main {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        UserService userService = new UserService();
        ExpenseService expenseService = new ExpenseService();
        BudgetService budgetService = new BudgetService();
        Budget budget = new Budget();

        List<Category> categories = new ArrayList<>();

        categories.add(new Category(1, "food"));
        categories.add(new Category(2, "travel"));
        categories.add(new Category(3, "shopping"));

        int userId = 1;
        int expenseId = 1;

        User currentUser = null;
        
        while(true){
            System.out.println("========= SMART EXPENSE TRACKER ===========");
            System.out.println("1.Register");
            System.out.println("2.Login");
            System.out.println("3.Add Expense");
            System.out.println("4.View Expense");
            System.out.println("5.Set Budget");
            System.out.println("6.Check Budget");
            System.out.println("7.Category Report");
            System.out.println("8.Logout");
            System.out.println("9.Exit");

            int choice = in.nextInt();

            switch (choice) {
                case 1:
                    in.nextLine();
                    System.out.println("Name: ");
                    String name = in.nextLine();
                    System.out.println("Email: ");
                    String email = in.nextLine();
                    System.out.println("Password: ");
                    String password = in.nextLine();

                    userService.register(new User(userId++,name,email,password));

                    break;


                case 2:
                    in.nextLine();
                    System.out.println("Email: ");
                    String loginEmail = in.nextLine();
                    System.out.println("Password: ");
                    String loginPassword = in.nextLine();
                    currentUser= userService.login(loginEmail,loginPassword);
                    if(currentUser != null){
                        System.out.println("Login success!!!");
                    }else{
                        System.out.println("Login Failed! Invalid Incredentails!!!");
                    }
                    break;

                case 3:
                    if(currentUser == null){
                        System.out.println("Invalid credentails?? Login First!!!");
                    }    

                    for(Category x : categories){
                        System.out.println(x);
                    }

                    int cId = in.nextInt();
                    
                    Category selectedCategory = categories.get(cId-1);
                    System.out.println("Amount: ");
                    int amount = in.nextInt();

                    in.nextLine();

                    System.out.println("Description");
                    String description = in.nextLine();

                    expenseService.addExpense(new Expense(expenseId++,amount,selectedCategory,description,currentUser));
                    break; 
                    
                case 4:
                    expenseService.viewExpense(currentUser);
                    break;
                    
                case 5:
                    System.out.println("Budget Amount: ");
                    budget.setLimit(in.nextDouble()); 
                    break;
                
                case 6:
                    budgetService.analyzeBudget(budget.getLimit(), expenseService.calculateTotal(currentUser));
                    break;
                    
                case 7:
                    expenseService.categoryReport(currentUser);
                    break;
                    
                case 8:
                    currentUser = null;
                    System.out.println("Logged out!!!");
                    break;
                 
                case 9:
                    System.out.println("System terminated!!!");
                    System.exit(0);     

                default:
                    break;
            }
        }

        
    }
    
}
