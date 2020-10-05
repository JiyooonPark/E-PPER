package Q2018;

import java.util.Scanner;

public class Question2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int room, th;
        if(number<15){
            room=1;
            th = number;
        }
        else{
            room = number/15;
            th = number  - 15*(room-1);
        }
        System.out.println(room+ " "+th)
;    }
}
