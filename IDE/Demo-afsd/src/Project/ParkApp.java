package Project;

import Project.Car;
import Project.MotorBike;
import Project.Van;
import Project.VehiclePark;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ParkApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 Car ");
        System.out.println("Enter 2 VAn ");
        System.out.println("Enter 3 MotorBike ");

        int vehicle = input.nextInt();

        ArrayList<VehiclePark> vehicleParks = new ArrayList<>();

        vehicleParks.add(new Car());
        vehicleParks.add(new Van());
        vehicleParks.add(new MotorBike());

        vehicleParks.get(0).startVehicle();
        vehicleParks.get(1).stopVehicle();
        vehicleParks.get(1).stopVehicle();

        //============================================

        HashSet<String> set = new HashSet<>();

        set.add("Ramesh");
        set.add("Kaushika");
        set.add("De Silva");
        set.add("Kaushika");

        System.out.println(set); //sout ekak gannawa nam for loop ekakk ganna ona

        HashMap<String,Object> map = new HashMap<>();

        map.put("name","Yasindu");
        map.put("age",24);
        map.put("address","Panadura");

        System.out.println(map.get("name")); //array List ekak wage nemei yanne out put ekak ganna ona nama variable type eka yanna ona
                                                // map kiyala refferance varriable eka type karoth okkoma out put wenawa

        












    }
}
