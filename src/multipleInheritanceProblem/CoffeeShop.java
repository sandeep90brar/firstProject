package multipleInheritanceProblem;

public class CoffeeShop implements Restaurant,OvenFresh{
    public void canOrderOnline(){
        System.out.println("customers can order food online");
    }

    public void canDineIn(){
        System.out.println("customers can enjoy their food in the restaurant");
    }
}
