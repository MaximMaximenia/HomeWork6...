package HW6.Ex1.by.teachmeskills.robot;

import HW6.Ex1.Samsung.SamsungIHand;
import HW6.Ex1.Samsung.SamsungIHead;
import HW6.Ex1.Samsung.SamsungILeg;
import HW6.Ex1.Sony.SonyIHand;
import HW6.Ex1.Sony.SonyIHead;
import HW6.Ex1.Sony.SonyILeg;
import HW6.Ex1.Toshiba.ToshibaIHand;
import HW6.Ex1.Toshiba.ToshibaIHead;
import HW6.Ex1.Toshiba.ToshibaILeg;


public class Run {

    public static void main(String[] args) {
        /*
        Создать по 3 реализации(Sony, Toshiba, Samsung) каждой запчасти(IHead, IHand, ILeg)
        Класс SonyHead является примером реализацией головы от Sony.
        Создайте 3 робота с разными комплектующими.
        Например у робота голова и нога от Sony а, рука от Samsung.
        У всех роботов вызовите метод action.
        Среди 3-х роботов щнайдите самого дорогого.
        */

        Robot Misha;
        SonyILeg sonyILeg = new SonyILeg(27);
        ToshibaIHand toshibaIHand = new ToshibaIHand(18);
        SamsungIHead samsungIHead = new SamsungIHead(49);
        Misha = new Robot(samsungIHead, toshibaIHand, sonyILeg);

        Robot Eddy;
        SonyIHand sonyIHand = new SonyIHand(25);
        ToshibaIHead toshibaIHead = new ToshibaIHead(10);
        SamsungILeg samsungILeg = new SamsungILeg(40);
        Eddy = new Robot(toshibaIHead, sonyIHand, samsungILeg);

        Robot Ted;
        SonyIHead sonyHead = new SonyIHead(32);
        ToshibaILeg toshibaILeg = new ToshibaILeg(33);
        SamsungIHand samsungIHand = new SamsungIHand(12);
        Ted = new Robot(sonyHead, samsungIHand, toshibaILeg);


        Misha.action();
        System.out.println();
        Ted.action();
        System.out.println();
        Eddy.action();
        System.out.println();
        int x = Misha.getPrice();
        int y = Ted.getPrice();
        int z = Eddy.getPrice();


        if (x>z&&x>y){
            System.out.println("Робот Misha самый дорогой.");
        }
        else if (y>x&&y>z){
            System.out.println("Робот Ted самый дорогой.");
        }
        else{
            System.out.println("Робот Eddy самый дорогой ");
        }
    }

}
