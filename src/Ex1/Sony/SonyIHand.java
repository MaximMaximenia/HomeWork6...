package Ex1.Sony;

import Ex1.by.teachmeskills.robot.hands.IHand;

public class SonyIHand implements IHand {
    private int price;

    public SonyIHand(int price) {
        this.price = price;
    }

    public SonyIHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony была поднята.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
