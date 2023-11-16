package Project2;

import java.util.ArrayList;
import java.util.Scanner;

public class VehiclePark {

    private String car;
    private String van;
    private String motorBike;

    public VehiclePark(String car, String van, String motorBike) {
        this.car = car;
        this.van = van;
        this.motorBike = motorBike;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public String getVan() {
        return van;
    }

    public void setVan(String van) {
        this.van = van;
    }

    public String getMotorBike() {
        return motorBike;
    }

    public void setMotorBike(String motorBike) {
        this.motorBike = motorBike;
    }
}
