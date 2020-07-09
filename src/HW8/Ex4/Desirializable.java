package HW8.Ex4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;

public class Desirializable {
    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("car.bin");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Car audi = (Car) ois.readObject();
            Car lada = (Car) ois.readObject();
            Car chepblrka = (Car) ois.readObject();

            System.out.println(audi);
            System.out.println(chepblrka);
            System.out.println(lada);


            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }


    }


}
