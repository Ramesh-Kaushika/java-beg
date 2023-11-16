package Example2;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

   /*     System.out.println("Enter 1 ");
        int numOne = input.nextInt();

        System.out.println("Enter 2 ");
        int numTwo = input.nextInt();


        try {
            System.out.println(numOne / numTwo);
        }
        catch (ArithmeticException ex){

            System.out.println("Pissuda Huththo");

        }
        System.out.println("End THe Progama");

        //number / 0 = infinity

       // :::::::::::::::::::::::::::::::::::::::::::::::::::::::::::


        int [] arr = new int [6];

        for (int i = 0; i < 7; i++) {

            try {
                arr [i]= 7;
            }
            catch (ArrayIndexOutOfBoundsException newArr){

                System.out.println("Ona kotuwak panapan");
            }



        }
        //out of bound

        //-------------------------------------------------------------------

       System.out.println("Enter Number ");
        String numStringOne = input.next();
        System.out.println("Enter Number ");
        String  = input.next();

       // int convert_Number = Integer.parseInt(numString);
       //12 System.out.println(convert_Number);

        //String number cant define

       // System.out.println(1);
*/

        try {
            Class.forName("com.mysql.cj.jdbc.Drive");
        } catch (ClassNotFoundException next) {
            System.out.println("Gedarra Plaan");
        }


        try {
            calculator();
        }
        catch (ClassNotFoundException next){

        }





    try {
        genEx();
    }
        catch (ErrorsDetecter yes){
            System.out.println("Error");
    }
 }







    public static void calculator() throws ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Drive");


    }


    public static void genEx() throws ErrorsDetecter {

        int age = 90;

        if(age>=18){

            throw new ErrorsDetecter( "hi");

        }

    }
}
