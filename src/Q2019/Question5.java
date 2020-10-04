package Q2019;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Question5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number [] = new int[2];
        number[0]= scanner.nextInt();
        number[1] = scanner.nextInt();
        String dictionary[] =  new String[number[0]];

        for(int i=0; i<number[0];i++){
            dictionary[i] = scanner.next();
        }
        for(int i=0; i<number[1];i++){
            printWord(scanner.next(), dictionary);
        }
    }
    public static void printWord(String a, String [] dictionary){
        Scanner scanner = new Scanner(System.in);
        ArrayList array = new ArrayList<String>();
        for(int i=0; i<dictionary.length;i++){
            if(a.equalsIgnoreCase(dictionary[i].substring(0,1))) {
                array.add(dictionary[i]);
            }
        }
        Collections.sort(array);
        printArray(array);
    }
    public static void printArray(ArrayList<String> array){
        for(int i =0; i<array.size();i++){
            System.out.print(array.get(i)+" ");
        }
    }
}
