package PI_session;

import java.util.*;

public class tips {
    public static void main(String [] args){
        int array [] = new int[10];
        for(int i=0; i<10; i++){
            array[i]=(10-i)*10;
        }
        for(int i:array){
            System.out.print(i+" ");
        }
        System.out.println();
        Arrays.sort(array);
        double a = Math.pow(2,5);
        String c ="my name ";
        String b = "your name";
        boolean boo = c.equals(b);
        for(int i:array){
            System.out.print(i+" ");
        }
        int arr1[] = new int[10];
        Arrays.fill(arr1, -1);
        for(int i=0; i<10; i++){
                System.out.print(arr1[i]+" ");
        }System.out.println();
        int len = array.length;
        int len_Str = b.length();
        int arr [][] = new int [10][10];
        Arrays.fill(arr, -1);
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        }
}
