package HW6.Ex2.Clothing;

public class GreenTrousers implements Trouser{
    @Override
    public void putOn() {
        System.out.println("Были надеты зеленые штаны ");

    }

    @Override
    public void takeOff() {
        System.out.println("Были сняты зеленые штаны ");
    }

}
