package Q2019;
import java.util.Scanner;

public class Question4 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("input the size of ground");
        int size[] = new int [2];
        size[0]=scanner.nextInt();
        size[1]=scanner.nextInt();
        int m=size[0], n=size[1];
        //System.out.println(m+" "+n);
        int turn=0;

        while(n>2){
            turn+=4;
            m=m-2;
            n=n-2;
        }
        if(n==2) turn=turn+2;

        System.out.println(turn);
    }
}
