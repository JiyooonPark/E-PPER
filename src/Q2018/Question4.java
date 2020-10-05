package Q2018;

import java.util.Scanner;

public class Question4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int y = len/2+1;
        int n=1;
        while(n!=len){
            for(int i=0; i<(len-n)/2;i++){
                System.out.print(" ");
            }
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            n+=2;
        }
        n=len;
        while(n!=-1){
            for(int i=0; i<(len-n)/2;i++){
                System.out.print(" ");
            }
            for(int i=0; i<n;i++){
                System.out.print("*");
            }
            System.out.println();
            n-=2;
        }
    }
}
