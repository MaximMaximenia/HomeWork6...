package HW7.Car;

import java.util.Random;

public class Car {


    private String mark;
    private int speed;
    private int cost;

    public String getMark() {
        return mark;
    }

    public void setMark() {
        this.mark = mark;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed() {
        this.speed = speed;
    }

    public Car(String mark, int speed, int cost) {
        this.mark = mark;
        this.speed = speed;
        this.cost = cost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost() {
        this.cost = cost;
    }


    public void start  (){
        Random r = new Random();
       int x= r.nextInt(20);
        if (x%2==0){
        try {
            throw new CarExeption();
        } catch (CarExeption e) {
            System.err.println("НЕ УДАЛОСЬ ЗАВЕСТИ АВТОМОБИЛЬ!");


       }}
       else{
           System.out.println("АВТОМОБИЛЬ С МАРКОЙ "+getMark()+" УСПЕШНО ЗАВЕЛСЯ! ");
       }}}



