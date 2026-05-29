package Low_Level.Real_Scanerio.VendingMachine;

public enum Coin {
    PENNY(1),
    NICKEL(5),
    DIME(10),
    QUATER(25);

    public int value;

    Coin(int value){
        this.value = value;
    }
}
