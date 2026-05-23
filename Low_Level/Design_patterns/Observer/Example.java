package Low_Level.Design_patterns.Observer;
// stock notify

import java.util.*;

interface Observer{
    void update(String message);
}

class Trader implements Observer{
    String name;

    Trader(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println(name + " received "+message);
    }
}

class Channel{
    List<Observer> traders = new ArrayList<>();

    void subscribe(Observer trader){
        traders.add(trader);
    }

    void notifyTraders(String message){
        for(Observer x : traders){
            x.update(message);
        }
    }

}

public class Example {
    public static void main(String[] args) {
        
        Channel stockMarket = new Channel();

        Trader t1 = new Trader("Dhinesh");
        Trader t2 = new Trader("Kumar");
        Trader t3 = new Trader("DK");

        stockMarket.subscribe(t1);
        stockMarket.subscribe(t2);
        stockMarket.subscribe(t3);

        stockMarket.notifyTraders("New Stock loaded!!!");
    }
}
