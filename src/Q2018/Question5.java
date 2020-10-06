package Q2018;

import java.util.Scanner;

public class Question5 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[8];
        for(int i=0; i<8; i++){
            array[i] = scanner.nextInt();
        }
        soultion(array);

    }

    private static void soultion(int[] array) {
        String value="nope";
        for(int i=0; i<8; i++){
            if(array[i]==8-i){
                //System.out.printf("%d %d\n", array[i], 8-i);
                value ="descending";
            }
            else {
                value ="nope";
                break;
            }
        }
        if(value =="nope"){
            for(int i=0; i<8;i++){
                if(array[i]==i+1) value ="ascending";
                else {
                    value ="nope";
                    break;
                }
            }
        }

        if(value =="nope") value ="mixed";
        System.out.println(value);
    }

}
