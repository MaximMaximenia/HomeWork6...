package Ex3;

import org.w3c.dom.ls.LSOutput;

import java.util.Random;

public class RussiaRocketPutin implements IStart{

    @Override
    public boolean preStartChek() {
        int x;
        Random r = new Random();
        x=r.nextInt(110);
        if (x%2==0){
            System.out.println("РАКЕТА \"ПУТИН\"");
            return true;

        }
        else{
            System.out.println("РАКЕТА \"ПУТИН\"");
            System.out.println();
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

        System.out.println("СТАРТ РАКЕТЫ \"ПУТИН\". .. . .");
    }
}
