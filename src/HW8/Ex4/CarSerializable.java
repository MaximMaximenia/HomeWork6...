package HW8.Ex4;

import java.io.*;

public class CarSerializable  {
    public static void main(String[] args) {
Car audi = new Car("audi",1000,1);
Car lada = new Car("lada",9999,100000);
Car chepblrka = new Car ("chepblrka",20,1000);



        try {
           FileOutputStream fos = new FileOutputStream("car.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(audi);
            oos.writeObject(chepblrka);
            oos.writeObject(lada);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}