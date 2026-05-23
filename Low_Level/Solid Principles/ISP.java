// violates the principle
interface Worker{
    void work();
    void eat();
}

class Robot implements Worker{
    public void work(){
        System.out.println("working!");
    }

    public void eat(){
        // No need
    }
}

// following the principle
interface Workable{
    void work();
}

interface Eatable{
    void eat();
}

class Human implements Workable,Eatable{
    public void work(){
        System.out.println("Human working!");
    }

    public void eat(){
      System.out.println("Human eating!");
    }
}

class Robots implements Workable{
    public void work(){
        System.out.println("Robot Working");
    }
}

public class ISP {
    public static void main(String[] args) {
        Human _human = new Human();
        _human.eat();
        _human.work();

        Robot _robot = new Robot();
        _robot.work();
    }
}
