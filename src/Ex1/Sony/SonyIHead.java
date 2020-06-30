package Ex1.Sony;

import Ex1.by.teachmeskills.robot.heads.IHead;

public class SonyIHead implements IHead {
    private int price;

    public SonyIHead(int price) {
        this.price = price;
    }

    public SonyIHead() {
    }

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}

