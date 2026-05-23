
// VIOLATION: One class handles everything
class BadUserService{
    public void registerUser(String username,String password){
        
        // Job 1 : Validation
        if(password.length() < 8){
            throw new IllegalArgumentException("password must be at least 8 characters");
        }
        // Job2 : Database operations
        System.out.println("[DB] Saving user: "+username+" to Mysql");

        // Job 3: Notification Log
        System.out.println("[Email] Sending welcome to "+username);
    }
}


// Now following the SRP: one class must do one job

class UserValidataor{
    public boolean isValid(String password){
        return password != null && password.length() >=8;
    }
}

class UserRespository{
    public void saveToDatabase(String username){
        System.out.println("[DB] Saving user: "+username+" to MYsql");
    }
}

class EmailService{
    public void sendWelcomeEmail(String username){
        System.out.println("[Email] Sending welcome email to "+username);
    }
}

// The Coordinator class
class GoodUserService{
    private final UserValidataor validataor = new UserValidataor();
    private final UserRespository respository = new UserRespository();
    private final EmailService service = new EmailService();

    public void registerUser(String username,String password){
        if(!validataor.isValid(password)){
            throw new IllegalArgumentException("Password must at least 8 characters!");
        }
        respository.saveToDatabase(username);
        service.sendWelcomeEmail(username);
    }
}

public class SingleResponsiblityPrinciple{
    public static void main(String[] args) {
        System.out.println("-- Single Responsiblity Principle!--");

        System.out.println("\n  Executing Adhering Code: ");
        GoodUserService good = new GoodUserService();
        good.registerUser("Dhinesh", "dhinesh123");
    }
}

/*
-- Single Responsiblity Principle!--

  Executing Adhering Code: 
[DB] Saving user: Dhinesh to MYsql
[Email] Sending welcome email to Dhinesh
*/