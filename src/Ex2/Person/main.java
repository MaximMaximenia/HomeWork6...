package Ex2.Person;

import Ex2.Clothing.*;


public class main {
    public static void main(String[] args) {
        BlueTrousers blueTrousers= new BlueTrousers();
        SportShoes sportShoes = new SportShoes();
        BlackJackets blackJackets = new BlackJackets();

        Person Shakyr = new Person("Shakyr",blueTrousers,sportShoes,blackJackets);
        System.out.println(Shakyr.getName());
        Shakyr.undress();
        System.out.println();
        Shakyr.stripped();
    }
}
