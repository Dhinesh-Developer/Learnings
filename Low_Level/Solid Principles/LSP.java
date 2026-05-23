// violates the principle
class BadBird{
    void fly(){
        System.out.println("Flying");
    }
}

class BadPenguin extends BadBird{
    void fly(){
        System.out.println("Cannot fly!");
    }
}

// following the principle
class Bird{
    void eat(){
        System.out.println("Eating");
    }
}

interface Flyable{
    void fly();
}

class Sparrow extends Bird implements Flyable{

    @Override
    public void fly(){
        System.out.println("Sparrow flying");
    }
}

class Penguin extends Bird{
    void swim(){
        System.out.println("Penguin swimming");
    }
}

public class LSP {
    public static void main(String[] args) {
        
        Sparrow sparrow = new Sparrow();
        sparrow.eat();
        sparrow.fly();

        Penguin penguin = new Penguin();
        penguin.eat();
        penguin.swim();

    }
}
