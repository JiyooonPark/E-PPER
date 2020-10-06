package PI_session;
import java.util.*;


public class Q2019_8 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int size[] = new int[2];
        size[0] = scanner.nextInt();
        size[1] = scanner.nextInt();
        int array [][] = new int[size[0]][size[1]];
        for(int i=0; i<size[0];i++){
            for(int j=0; j<size[1];j++){
                array[i][j] = scanner.nextInt();
            }
        }
        solution(array);
    }

    private static void solution(int array[][]){

    }
}
