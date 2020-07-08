package HW6.Ex2.Clothing;

public class BlackJackets implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Была надета черная куртка");
    }

    @Override
    public void takeOff() {
        System.out.println("Была снята черная куртка");

    }
}
