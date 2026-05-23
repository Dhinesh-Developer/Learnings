
// violates the principle

class BadDiscount{
    double getDiscount(String type){
        if(type.equals("NEW")) return 10;
        else if(type.equals("VIP")) return 20;
        return 0;
    }
}

// Extension without modification
interface Discount{
    double getDiscount();
}

class NewUserDiscount implements Discount{
    public double getDiscount(){
        return 10;
    }
}

class VipUserDiscount implements Discount{
    public double getDiscount(){
        return 20;
    }
}


public class OCP {
    public static void main(String[] args) {
        Discount discount = new NewUserDiscount();
        System.out.println("Discount: "+discount.getDiscount());

        Discount discount2 = new VipUserDiscount();
        System.out.println("Discount: "+discount2.getDiscount());
    }
}
