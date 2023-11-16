package Example2;

import Example.Animal;

import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        Student s1  = new Student();

        s1.setName("Ramesh");
        s1.setId(100);
        s1.setAddress("Demodara");

        System.out.println(s1.getName());
        System.out.println(s1.getId());
        System.out.println(s1.getAddress());

        Car c1 = new Car();
       // c1.speed();
        c1.noOfGear=7;
        c1.noOfmodel="10";

        Vehicle V1 = new Car();

        V1.noOfmodel = 4;
       // V1.
        System.out.println("To String Is : "+c1.toString());

        Object ob = new Car();

        //ob.toString() =

        Object ob2 = new Scanner (System.in);

        Animal a1 = new Lion();

       a1.drink ();
        System.out.println(a1.drink());

        Lion3 l1 = new Lion3();

        l1.learn();

        Lion3 ll1 = new Lion4();

        ll1.learn();

        System.out.println(ll1.hashCode());







    }

}
