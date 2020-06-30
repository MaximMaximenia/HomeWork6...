package Ex2.Person;

import Ex1.by.teachmeskills.robot.IRobot;
import Ex1.by.teachmeskills.robot.hands.IHand;
import Ex1.by.teachmeskills.robot.heads.IHead;
import Ex1.by.teachmeskills.robot.legs.ILeg;
import Ex2.Clothing.*;

public class Person {
    public String name;
    public Trouser trousers;
    public Shoe shoes;

    public Trouser getTrousers() {
        return trousers;
    }

    public void setTrousers(Trouser trousers) {
        this.trousers = trousers;
    }

    public Shoe getShoes() {
        return shoes;
    }

    public void setShoes(Shoe shoes) {
        this.shoes = shoes;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Jacket jacket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name, Trouser trousers, Shoe shoes, Jacket jacket) {
        setName(name);
        setJacket(jacket);
        setShoes(shoes);
        setTrousers(trousers);

    }

    void undress() {
        trousers.putOn();
        shoes.putOn();
        jacket.putOn();
    }

    void stripped() {
        trousers.takeOff();
        shoes.takeOff();
        jacket.takeOff();
    }

}
