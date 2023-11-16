package StringAPI;

import Products.Clothing;
import Products.Electronic;
import Products.Product;
import Products.Toy;

import java.util.ArrayList;
import java.util.Scanner;

public class StringAPI {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



    String name = "Ramesh";
    String name2 = "Ramesh";

    String name3 = "Kaushika";

    String name4 = new String ("Hello");
    String name5 = new String ("Hello");

    ///////////////////////////////////===========================

        StringBuilder builder = new StringBuilder("Pasindu");

        StringBuffer buffer = new StringBuffer("Kavindu");

    String val1 = "Saman";

        System.out.println(val1+" Prabhashwara");
        System.out.println(val1);
        System.out.println(val1.concat(" Prabhashwara"));
        System.out.println(val1);
        System.out.println();

        System.out.println(builder);
        System.out.println(builder.append(" Prabha"));
        System.out.println(builder);
        System.out.println();
        System.out.println();

        String address = "Kaushika De Silva";

        System.out.println(address.length());
        System.out.println(address.toLowerCase());
        System.out.println(address.toUpperCase());
        System.out.println(address.charAt(1));
        System.out.println(address.substring(3));


       // ---------------------------------------------------------------------------

             //   Collection Framework

        ArrayList list = new ArrayList();

        list.add(10);
        list.add(20);
        list.add("Ramesh");
        list.add('c');
        list.add(13.2);
       // list.add(new S()); object can add
        list.add(new Scanner(System.in));

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
       // System.out.println(list.get(5));

        //Generic ArrayList
        //<add brackets and initialize Wrapper Classes data classes or object class>


        ArrayList<Product> products = new ArrayList();

        products.add(new Clothing());
        products.add(new Toy());
        products.add(new Electronic());
        System.out.println();



        products.get(0).selling();
        products.get(1).selling();
        products.get(2).selling();






    }

}
