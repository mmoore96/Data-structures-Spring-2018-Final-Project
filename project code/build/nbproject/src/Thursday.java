/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marshall_groupproject;

import acmesorting.ACMESorting;
import ajaxsorting.AJAXSorting;
import java.util.Random;

/**
 *
 * @author Austin
 */
public class Thursday {
    
    public static void CSSSortThursday(int[] values){
        
        System.out.println("__________________________________________________");
        System.out.println("Thursday Test of array size: " + values.length);
        System.out.println("__________________________________________________");
        
        
        //ACME sort time tester
        System.out.println("ACME Sort: Thursday");
        long startTime2 = System.nanoTime();
        System.out.println("Number of comparisions: " + ACMESorting.acmeSorting(values));
        long endTime2 = System.nanoTime();
        double time2 = (endTime2 - startTime2);
        System.out.printf("ACME Sort time in seconds: %.8f %n", time2 / 100000000);
        System.out.println("ACME Sort time in nanoseconds: " + time2 + "\n");
        
        //AJAX sort time tester
        System.out.println("AJAX Sort: Thursday");
        long startTime3 = System.nanoTime();
        System.out.println("Number of comparisions: " + AJAXSorting.AJAXSorting(values));
        long endTime3 = System.nanoTime();
        double time3 = (endTime3 - startTime3);
        System.out.printf("AJAX Sort time in seconds: %.8f %n", time3 / 100000000);
        System.out.println("AJAX Sort time in nanoseconds: " + time3 + "\n");
    
    }
    
    public static int[] createArray(int size){
        Random rand = new Random();
        //creates array to be sorted
        int[] array = new int[size];
        int stop = array.length;
        for (int i = 0; i < stop; i++){
            int x = rand.nextInt(1000000);
            array[i] = x;
        }
        return array;
    }
    
}
