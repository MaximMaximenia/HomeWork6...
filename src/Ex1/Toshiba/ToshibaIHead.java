package Ex1.Toshiba;

import Ex1.by.teachmeskills.robot.heads.IHead;

public class ToshibaIHead implements IHead {
    private int price;

    public ToshibaIHead(int price) {
        this.price = price;
    }

    public ToshibaIHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}