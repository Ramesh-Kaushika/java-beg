package Project;

public class Car extends VehiclePark{


    @Override
    public void startVehicle() {

        System.out.println("Start Car");
    }

    @Override
    public void stopVehicle() {

        System.out.println("Stop Car");
    }
}
