/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marshall_groupproject;



/**
 *
 * @author Austin
 */
import java.lang.Math;
import java.util.Scanner;

public class Marshall_GroupProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int loop;
        do{
            System.out.println("Please select an option to continue.");
            System.out.println("        1)View Data 1/1000 Test");
            System.out.println("        2)View Project Data 1/1 Test");
            System.out.println("        3)Extra Test Code");
            System.out.println("        4)Exit");
            loop = Integer.parseInt(scan.nextLine());
            switch(loop)
            {
                case 1:
                    //All average daily values (1/1000)
                    Monday.CSSSortMonday(Monday.createArray(10000));
                    Tuesday.CSSSortTuesday(Tuesday.createArray(1000));
                    Wednesday.CSSSortWednesday(Wednesday.createArray(30000));
                    Thursday.CSSSortThursday(Thursday.createArray(50000));
                    Friday.CSSSortFriday(Friday.createArray(500));
                    Saturday.CSSSortSaturday(Saturday.createArray(100000));
                    Sunday.CSSSortSunday(Sunday.createArray(100));
                    break;
                    
                case 2:
                    Marshall_GroupProject.projectAJAX("Monday", 10000000);
                    Marshall_GroupProject.projectACME("Monday", 10000000);
                    Marshall_GroupProject.projectAJAX("Tuesday", 1000000);
                    Marshall_GroupProject.projectACME("Tuesday", 1000000);
                    Marshall_GroupProject.projectAJAX("Wednesday", 30000000);
                    Marshall_GroupProject.projectACME("Wednesday", 30000000);
                    Marshall_GroupProject.projectAJAX("Thursday", 50000000);
                    Marshall_GroupProject.projectACME("Thursday", 50000000);
                    Marshall_GroupProject.projectAJAX("Friday", 500000);
                    Marshall_GroupProject.projectACME("Friday", 500000);
                    Marshall_GroupProject.projectAJAX("Saturday", 100000000);
                    Marshall_GroupProject.projectACME("Saturday", 100000000);
                    Marshall_GroupProject.projectAJAX("Sunday", 100000);
                    Marshall_GroupProject.projectACME("Sunday", 100000);
                    break;
                    
                case 3:
                    //Atempt to replicate ACME return number
                    int count = 0;
                    int[] array = Sunday.createArray(100);
                    for (int i = 0; i < array.length; i++){
                        for (int j = i; j < array.length; j++){
                            count++;
                        }
                    }
                    System.out.println(count);
                    break;
                    
                case 4:
                    break;
                
                default:
                //catch if user did not select valid option
                    System.out.println("Please enter a number displayed.");
                    break;
            }
        }while(loop != 4);
    }
    
    public static void projectACME(String day, int n){
        System.out.println("\nData Print ACME for: " + day);
        System.out.println("Number of comparisons: " + Marshall_GroupProject.projectCompACME(n));
        System.out.println("Best Time: " + Marshall_GroupProject.projectTimeBestACME(n));
        System.out.println("Worst Time: " + Marshall_GroupProject.projectTimeWorstACME(n));
        System.out.println("Average Time: " + Marshall_GroupProject.projectTimeACME(n));
    }
    
    public static void projectAJAX(String day, int n){
        System.out.println("\nData Print AJAX for: " + day);
        System.out.println("Number of comparisons: " + Marshall_GroupProject.projectCompAJAX(n));
        System.out.println("Best Time: " + Marshall_GroupProject.projectTimeBestAJAX(n));
        System.out.println("Worst Time: " + Marshall_GroupProject.projectTimeWorstAJAX(n));
        System.out.println("Average Time: " + Marshall_GroupProject.projectTimeAJAX(n));
    }
    
    //Number of compares mad eby ACME program
    public static int projectCompACME(int n){
        int comp = n*(n+1)/2;
        return comp;
    }
    
    //Number of compares made by AJAX program
    public static double projectCompAJAX(int n){
        double comp = n*(Math.log(n)/Math.log(2)) * 0.95;
        return comp;
    }
    
    //Average Time to run ACME program in ms
    public static double projectTimeACME(int n){
        //At 3GHz
        int worst = n*6;
        int best = n*3;
        int avg = (best + worst) / 2;
        double time = avg / 3000000;
        return time;
    }
    
    //Fastest time to run ACME program in ms
    public static double projectTimeBestACME(int n){
        //At 3GHz
        int best = n*3;
        double time = best / 3000000;
        return time;
    }
    
    //Slowest time to run ACME program in ms
    public static double projectTimeWorstACME(int n){
        //At 3GHz
        int worst = n*6;
        double time = worst / 3000000;
        return time;
    }
    
    //Average time to run AJAX program in ms
    public static double projectTimeAJAX(int n){
        //At 3GHz
        int worst = n*10;
        int best = n*14;
        int avg = (best + worst) / 2;
        double time = avg / 3000000;
        return time;
    }
    
    //Fastest time to run AJAX program in ms
    public static double projectTimeBestAJAX(int n){
        //At 3GHz
        int best = n*14;
        double time = best / 3000000;
        return time;
    }
    
    //Slowest time to run AJAX program in ms
    public static double projectTimeWorstAJAX(int n){
        //At 3GHz
        int worst = n*14;
        double time = worst / 3000000;
        return time;
    }
}
