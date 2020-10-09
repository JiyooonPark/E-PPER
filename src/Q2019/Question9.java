package Q2019;

import java.util.Arrays;
import java.util.Scanner;

public class Question9 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array [][] = new int [size][size];
        //Arrays.fill(array, -1);
        for(int i=0; i<size;i++){
            for(int j=0; j<i+1;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        int total =0;
        soultion(array, size);
    }

    private static void soultion(int[][] array, int size) {
        int total = nextBig(array, size, 0, 0, 0);
        System.out.println(total);
    }

    private static int nextBig(int array[][] ,int size, int i, int j, int total) {
        int a = array[i+1][j];
        int b = array[i+1][j+1];
        int c;
        int max;
        if( a>b) {
            max =a;
            c=j;
        }
        else {
            max =b;
            c=j+1;
        }
        total+=max;
        if( i==size-1) return max+total;
        else{
            return nextBig(array, size, i+1, c, total);
        }
    }
}
