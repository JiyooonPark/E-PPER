package Q2019;

import java.util.Scanner;

public class Question2 {
    public static void main(String [] args){
        double stuScores[] = getList();
        //printArray(stuScores);
        int overStudents=overAverage(stuScores);
        double r = ratio(stuScores, overStudents);
        printResult(r);
    }
    public static double[] getList(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. How many students are there?\n2. list the student's scores");
        double stuScores[];
        int stuNum = scanner.nextInt();
        stuScores = new double[stuNum];
        for(int i=0; i<stuNum; i++){
            stuScores[i]=scanner.nextDouble();
        }
        return stuScores;
    }
    public static double average(double array[]){
        int total=0, average;
        for(int i =0; i<array.length;i++){
            total +=array[i];
        }
        average = total/array.length;
        return average;
    }
    public static int overAverage( double array[]){
        int overStudents=0;
        double average=average(array);
        for(int i=0; i<array.length; i++){
            if(array[i]>average) overStudents++;
            else continue;
        }
        //System.out.println("average: " +average+" over Students: "+overStudents);
        return overStudents;
    }
    public static double ratio(double array[], int n){
        //System.out.println(n+" "+array.length);
        return (double)n/array.length;
    }
    public static void printResult(double ratio){
        System.out.printf("%.3f%%",ratio*100);
    }
    public static void printArray(double array []){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
