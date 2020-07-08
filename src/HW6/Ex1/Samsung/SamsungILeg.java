package HW6.Ex1.Samsung;

import HW6.Ex1.by.teachmeskills.robot.legs.ILeg;


public class SamsungILeg implements ILeg {
    private int price;

    public SamsungILeg(int price) {
        this.price = price;
    }

    public SamsungILeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung сделала шаг.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}


