package HW8.Ex4;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable {

    private String brand;
    private int speed;
    private int coast;

    public String getBrand() {
        return brand;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCoast() {
        return coast;
    }

    public Car(String brand, int speed, int coast) {
        this.brand = brand;
        this.speed = speed;
        this.coast = coast;
    }
    public String toString(){
        return "Автомобиль марки "+brand+" имеет максимальную скорость "+speed+" км/ч и стоит "+coast +" BYN.";
    }
}
