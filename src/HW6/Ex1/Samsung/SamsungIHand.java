package HW6.Ex1.Samsung;

import HW6.Ex1.by.teachmeskills.robot.hands.IHand;

public class SamsungIHand implements IHand {
    private int price;

    public SamsungIHand(int price) {
        this.price = price;
    }

    public SamsungIHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Samsung  была поднята вверх.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
