package Ex1.Samsung;

import Ex1.by.teachmeskills.robot.heads.IHead;

public class SamsungIHead implements IHead {
    private int price;

    public SamsungIHead(int price) {
        this.price = price;
    }

    public SamsungIHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Samsung ");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
