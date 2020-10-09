package Q2019;

import java.util.Scanner;

public class Question9 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array [][] = new int [size][size];
        int j=0;
        for(int i=0; i<size;i++){
            for(int j=0; j<i;j++){
                array[i][j] = scanner.nextInt();
            }
        }
        int total =0;
        soultion(array, size);
    }

    private static void soultion(int[][] array, int size) {
        nextBig(array, size, 1);
    }

    private static int nextBig(int array[][] ,int size, int i) {
        int max = array[i][0];

        if( i==size-1) return max;
    }
}
