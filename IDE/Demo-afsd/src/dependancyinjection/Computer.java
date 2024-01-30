package dependancyinjection;

public class Computer {

    Ram ram;

    public Computer(Ram ram){

        this.ram = ram;
    }

    public void start() {
        ram.start();
    }




}
