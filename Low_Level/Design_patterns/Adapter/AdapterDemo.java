package Low_Level.Design_patterns.Adapter;

class AndriodCharger{
    void charge(){
        System.out.println("Charging Andriod!");
    }
}

interface IPhoneCharger{
    void charge();
}

class Adapter implements IPhoneCharger{
    AndriodCharger charger = new AndriodCharger();

    public void charge(){
        charger.charge();
    }
}

public class AdapterDemo {
    public static void main(String[] args) {
        
        IPhoneCharger charger = new Adapter();
        charger.charge();

    }
}
