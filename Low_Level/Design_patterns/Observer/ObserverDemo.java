package Low_Level.Design_patterns.Observer;
// when one object changes => others get notified 

import java.util.*;

interface Observer{
    void update(String message);
}

class User implements Observer{
    String name;

    User(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(name+ " received "+message);
    }
}

class Channel{
    List<Observer> users = new ArrayList<>();

    void subscribe(Observer user){
        users.add(user);
    }

    void notifyUser(String message){
        for(Observer x : users){
            x.update(message);
        }
    }

}

public class ObserverDemo {
    public static void main(String[] args) {
        
        Channel youtube = new Channel();

        User u1 = new User("Dhinesh");
        User u2 = new User("Kumar");

        youtube.subscribe(u1);
        youtube.subscribe(u2);

        youtube.notifyUser("New Video Uploaded!!!");
        
    }
}
