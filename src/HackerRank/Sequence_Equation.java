package HackerRank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
class point{
    int x, y;
    point(int x, int y){
        this.x = x;
        this.y = y;
        System.out.println(x+" "+y+" point made\n");
    }
}
class func{
    int size;
    point points[];
    func(int[] p){
        points = new point[p.length];
        for( int i=0; i<p.length; i++){
            points[i] = new point(i+1, p[i]);
        }
        size = points.length;
    }

    public int xToY(int x){
        for(point p :points){
            if(p.x == x) return p.y;
        }
        return -1;
    }
    public int yToX(int y){
        for(point p :points){
            if(p.y == y) return p.x;
        }
        return -1;
    }
    public int[] ans(){
        int a[] = new int[size];
        for( int i=0; i<size; i++){
            a[i] = yToX(yToX(i+1));
        }
        return a;
    }
}
class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        func F = new func(p);
        return F.ans();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
