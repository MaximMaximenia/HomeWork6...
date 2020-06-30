package Ex2.Clothing;

public class BlueTrousers implements Trouser {

    @Override
    public void putOn() {
        System.out.println("Были надеты синие штаны ");

    }

    @Override
    public void takeOff() {
        System.out.println("Были сняты синие штаны ");
    }
}
