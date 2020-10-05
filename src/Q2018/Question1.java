package Q2018;

import java.util.Scanner;

public class Question1 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int arr[] = new int[len];
        for(int i=0; i<len; i++){
            arr[i]=scanner.nextInt();
        }
        int fr = scanner.nextInt();
        int to = scanner.nextInt();
        int result=0;
        for(int i=fr-1; i<to;i++){
            result += arr[i];
        }
        System.out.print(result);
    }

}
