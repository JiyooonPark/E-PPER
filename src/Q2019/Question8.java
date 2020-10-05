package Q2019;

import java.util.Scanner;

public class Question8 {
    public static void main(String []args){
        Scanner scanner = new Scanner(System.in);
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        int array[][] = new int[X][Y];
        int temp[][] = new int[X][Y];
        resetArray(temp);
        int count=0;
        boolean changed;

        for(int i=0; i<X; i++){
            for(int j =0;j<Y;j++){
                array[i][j]= scanner.nextInt();
            }
        }
        //print(array);

        while(true){
            count++;
            print(array);
            for(int i=0; i<X;i++) {
                for (int j = 0; j < Y; j++) {
                    if (array[i][j] == 1) {
                        changed = expand(array, i, j);
                        if(!changed){
                            break;
                        }
                        else {
                            continue;
                        }
                    }
                }
            }
        }
        //System.out.println(count);
    }

    private static void resetArray(int[][] temp) {
        for(int i=0; i<temp.length;i++){
            for(int j=0; j<temp[0].length;j++){
                temp[i][j] =0;
            }
        }
    }

    private static boolean change(int[][] temp, int[][] array) {
        System.out.println("-------------------비교----------------");
        print(array);
        print(temp);
        for(int i=0; i<temp.length;i++){
            for(int j=0; j<temp[0].length; j++){
                if(temp[i][j]!=array[i][j]){
                    System.out.println("different");
                    return true;
                }
                else{
                    System.out.println("!");
                }
            }
        }
        System.out.println("same");
        return false;
    }

    public static boolean expand(int array[][],int i,int j){
        int X = array.length;
        int Y = array[0].length;
        int a[][] = {{-1,0},{0,1},{1,0},{0,-1}};
        boolean changed=false;
        for(int k=0; k<4;k++){
            //System.out.println(1);
            if(valid(i+a[k][0], X)&&valid(j+a[k][1], Y)){
                if(array[i+a[k][0]][j+a[k][1]]==0){
                    array[i+a[k][0]][j+a[k][1]]=1;
                    changed = true;
                }
                else{
                    continue;
                }
            }
           // print(array);
        }
        return changed;
    }

    private static boolean valid(int i, int X) {
        if((i>=0)&&(i<X)) return true;
        else return false;
    }
    private static void print(int[][]array){
        for(int i=0; i<array.length; i++){
            for(int j=0; j<array[0].length;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
    }
}
