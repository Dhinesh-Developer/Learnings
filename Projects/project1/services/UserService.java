package project1.services;

import java.util.ArrayList;
import java.util.List;

import project1.models.User;

public class UserService {
    
    private List<User> users = new ArrayList<>();

    public void register(User user){
        users.add(user);
        System.out.println("Registeration successful!!");
    }

    public User login(String email,String password){
        for(User x : users){
            if(x.getEmail().equals(email) && x.getPassword().equals(password)){
                return x;
            }
        }
        return null;
    }

}
