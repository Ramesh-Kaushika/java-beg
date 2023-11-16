package Project;

public class Van extends VehiclePark{


    @Override
    public void startVehicle() {
        System.out.println("Start Van");
    }

    @Override
    public void stopVehicle() {
        System.out.println("Stop Van");
    }
}
