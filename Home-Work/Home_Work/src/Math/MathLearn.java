package Math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MathLearn {

    public static void main(String[] args) {

        String name = "Ramesh";

        int x = 64;

        int upperbound = 101;

        //Math() Square Value add===========================================

        System.out.println(Math.sqrt(x));

        //Random Value Add==========================================================

        int [] myArray = new int [10];

        Random random = new Random();

        for (int i = 0; i < myArray.length; i++) {

            myArray[i] = random.nextInt(upperbound);
            System.out.println(myArray[i]);


        }

        //ArrayList Random Value Add==========================================

        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i< 10; i++) {
            arrayList.add(random.nextInt(upperbound));
            // arrayList.add(0);

        }
        System.out.println(arrayList);


//Math.Max/ Math.Min /Sort.

        System.out.println("Math Max Min Sort");

        int [] maxRandom = new int[10];

        int val = maxRandom[0];

        int [] r = new int[maxRandom.length];
        for (int i = 0; i < maxRandom.length ; i++) {

            maxRandom[i] = random.nextInt(upperbound);
            System.out.println(maxRandom[i]);

        }
        System.out.println("next");
        for (int number : maxRandom) {
            val = Math.max(val,number);

        }
        System.out.println(val);

        //Array.sort list(adu eka idan wadi ekata)====================================

        int[] number = {1,3,6,4,2,5,8,0,4,9,43,};

        Arrays.sort(number);

        System.out.println(Arrays.toString(number));





    }


}
