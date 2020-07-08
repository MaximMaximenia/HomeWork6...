package HW6.Ex2.Clothing;

public class SportShoes  implements Shoe {

    @Override
    public void putOn() {
        System.out.println("Была надета спортивная обувь");
    }

    @Override
    public void takeOff() {
        System.out.println("Была снята спортивная обувь");
    }
}

