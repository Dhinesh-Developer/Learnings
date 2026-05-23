
// viloates the Principle

// Tightly coupled

class MySQLDatabase{
    void connect(){
        System.out.println("connected to Mysql");
    }
}

class UserService{
    MySQLDatabase db = new MySQLDatabase();

    void getUser(){
        db.connect();
    }
}


// following the principle
interface Database{
    void connect();
}

class MysqlDatabase implements Database{
    public void connect(){
        System.out.println("Connected to Mysql!");
    }
}

class MongodbDatabase implements Database{
    public void connect(){
        System.out.println("connected to MongoDB!");
    }
}

class UserServices{
    private Database db;

    UserServices(Database db){
        this.db = db;
    }

    void getUser(){
        db.connect();
    }
}

public class DIP {
    public static void main(String[] args) {
        Database db = new MysqlDatabase();
        UserServices _service = new UserServices(db);
        _service.getUser();
    }
}
