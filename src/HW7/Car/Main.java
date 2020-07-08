package HW7.Car;

public class Main {
    public static void main(String[] args)  {
        Car Audi = new Car("Audi", 1000, 10);
        Audi.start();
        Car Lada = new Car("Lada", 22323232, 1323232323);
        Lada.start();
        Car Volvo = new Car("Volvo", 223, 551);
        Volvo.start();
    }
}
