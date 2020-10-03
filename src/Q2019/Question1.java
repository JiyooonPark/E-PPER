package Q2019;
import java.util.Scanner;

public class Question1 {
    public static void main(String [] args){
        int year = getInput();
        boolean value = lunarYear(year);
        printTF(value);
    }
    public static boolean lunarYear(int year){
        if(year%400 ==0) return true;
        else if(year % 100 ==0) return false;
        else if (year % 4 ==0) return true;
        else return false;
    }
    public static int getInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input a year to see if it is a lunar year: ");
        int year = scanner.nextInt();
        return year;
    }
    public static void printTF(boolean value){
        if(value == true) System.out.println("T");
        else System.out.println("F");
    }
}

