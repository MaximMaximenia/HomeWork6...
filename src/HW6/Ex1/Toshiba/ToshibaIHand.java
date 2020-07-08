package HW6.Ex1.Toshiba;

import HW6.Ex1.by.teachmeskills.robot.hands.IHand;

public class ToshibaIHand implements IHand {
    private int price;

    public ToshibaIHand(int price) {
        this.price = price;
    }

    public ToshibaIHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Toshiba была поднята.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
