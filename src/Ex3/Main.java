package Ex3;

public class Main {
    public static void main(String[] args) {
        IStart goRussiaRocketPutin = new RussiaRocketPutin();
        IStart goUsaRocketApalon = new UsaRocketApalon();
        IStart goShuttle = new Shuttle();

        SpacePort spacePort = new SpacePort();
        spacePort.Launch(goRussiaRocketPutin);
        spacePort.Launch(goShuttle);
        spacePort.Launch(goUsaRocketApalon);


    }}


