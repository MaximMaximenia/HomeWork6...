package HW6.Ex3;

import java.util.Random;

public class UsaRocketApalon implements IStart{

    @Override
    public boolean preStartChek() {
        int x;
        Random r = new Random();
        x=r.nextInt(50);
        if (x%2==1){
            System.out.println("РАКЕТА \"АПАЛОН\"");
            return true;

        }
        else{
            System.out.println("РАКЕТА \"АПАЛОН\"");
            return false;
        }

    }

    @Override
    public void engineStart() {

        System.out.println("Двигатели ракеты запущенны, все системы в норме.");
        System.out.println("........ . .. .. .. . .. . .. . ......");
    }

    @Override
    public void start() {

        System.out.println("СТАРТ РАКЕТЫ \"АППАЛОН-1\". .. . .");
    }
}
