package project2.models;

public class User {

    protected int id;
    protected String name;
    protected String phone;

    public User(int id, String name, String phone) {
        this.id = id;
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
}