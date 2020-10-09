package Q2019;

import java.util.Scanner;

public class Question7 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int xs = scanner.nextInt();
        int ys = scanner.nextInt();
        char array[][] = new char[x][y];
        char result[][] = new char[x*xs][y*ys];
        String temp[] = new String[x];

        for(int i=0; i<x;i++){
            temp[i]=scanner.next();
        }

        for(int i=0; i<x;i++){
            for(int j=0;j<y;j++){
                array[i][j]=temp[i].charAt(j);
            }
        }

        for(int i=0; i< array.length; i++){
            for(int j=0; j<array[0].length;j++){
                for(int k=0; k<xs; k++){
                    for(int l=0; l<ys; l++){
                        System.out.print(array[i][j]);
                    }
                }

            }System.out.println();
        }
        //System.out.println(x*xs+" "+y*ys);
        for(int i=0; i<y*ys; i++){
            for(int j=0;j<x*xs; j++){
                //System.out.print("( "+i+","+j+" ) "+result[i][j]);
            }
            System.out.println();
        }

    }
}
/*
3 3 1 2
.x.
x.x
.x.
 */