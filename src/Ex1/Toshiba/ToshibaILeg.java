package Ex1.Toshiba;

import Ex1.by.teachmeskills.robot.legs.ILeg;

public class ToshibaILeg implements ILeg {
    private int price;

    public ToshibaILeg(int price) {
        this.price = price;
    }

    public ToshibaILeg() {
    }

    @Override
    public void step() {
        System.out.println("Нога Toshiba сделала шаг.");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
