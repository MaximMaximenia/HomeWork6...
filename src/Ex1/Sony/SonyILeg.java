package Ex1.Sony;

import Ex1.by.teachmeskills.robot.legs.ILeg;

public class SonyILeg implements ILeg {
    private int price;

    public SonyILeg(int price) {
        this.price = price;
    }

    public SonyILeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Sony сделала шаг.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}


