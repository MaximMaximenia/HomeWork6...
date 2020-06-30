package Ex3;

import java.util.Random;

public class Shuttle implements IStart{


    @Override
    public boolean preStartChek() {
        int x;
      Random r = new Random();
      x=r.nextInt(10);
      if (x>3){
          System.out.println("РАКЕТА \"ШАТЛ\"");
          return true;
      }
      else{
          System.out.println("РАКЕТА \"ШАТЛ\"");
          return false;
      }
    }

    @Override
    public void engineStart() {

        System.out.println("Двигатели шатла запущенны, все системы в норме.");
        System.out.println("........ . .. .. .. . .. . .. . ......");

    }

    @Override
    public void start() {

        System.out.println("СТАРТ ШАТЛА . .. . .");

    }
}
