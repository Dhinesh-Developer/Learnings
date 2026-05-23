package Low_Level.Design_patterns.singleton;

class DatabaseConnection{
    public static DatabaseConnection instance;

    private DatabaseConnection(){
        System.out.println("Object created!");
    }

    public static DatabaseConnection getInstance(){
        if(instance == null){
            instance = new DatabaseConnection();
        }
        return instance;
    }
}

class UserDao{

    public void connectToDb(){
        DatabaseConnection con = DatabaseConnection.getInstance();
        System.out.println("[DB] connected for UserDao: "+con);
    }
    
}

class ProductDao{
    public void connectToDb(){
        DatabaseConnection con = DatabaseConnection.getInstance();
        System.out.println("[DB] connected for ProductDao: "+con);
    }
}

public class Example {
    public static void main(String[] args) {
        UserDao udao = new UserDao();
        udao.connectToDb();

        ProductDao pdao = new ProductDao();
        pdao.connectToDb();

        System.out.println(udao.equals(pdao));
    }
}

/**
 * 
 * Object created!
[DB] connected for UserDao: Low_Level.Design_patterns.singleton.DatabaseConnection@7e9e5f8a
[DB] connected for ProductDao: Low_Level.Design_patterns.singleton.DatabaseConnection@7e9e5f8a
false
 */
