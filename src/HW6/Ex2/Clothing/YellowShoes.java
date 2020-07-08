package HW6.Ex2.Clothing;

public class YellowShoes implements Shoe {

    @Override
    public void putOn() {
        System.out.println("Была надета желтая обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Была снята желтая обувь");
    }
}
