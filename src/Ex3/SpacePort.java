package Ex3;

import java.time.chrono.IsoChronology;

public class SpacePort {
    public SpacePort(){

    }
    public void Launch(IStart istart) {
        if (istart.preStartChek()) {
            istart.engineStart();
            for (int i = 0; i < 11; i++) {
                System.out.println(i);
            }
            System.out.println();
            istart.start();
            System.out.println("------------------------------------------------------");
           }
        else {
            System.out.println("Предстартовая проверка провалена.");
            System.out.println("-------------------------------------------------");
        }
    }
}
