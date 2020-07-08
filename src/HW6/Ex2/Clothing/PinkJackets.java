package HW6.Ex2.Clothing;

public class PinkJackets implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Была надета розовая куртка");
    }

    @Override
    public void takeOff() {
        System.out.println("Была снята розовая куртка");

    }
}
