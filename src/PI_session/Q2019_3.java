package PI_session;

import java.util.Arrays;
import java.util.Scanner;

public class Q2019_3 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String array [] = new String[2];
        array[0]=scanner.next();
        array[1] = scanner.next();
        char result = solution(array);
        System.out.print(result);

    }

    private static char solution(String[] array) {
        array[0] = array[0].toLowerCase();
        array[1] = array[1].toLowerCase();
        char array1[] = array[0].toCharArray();
        char array2[] = array[1].toCharArray();
        char result='T';
        Arrays.sort(array1);
        Arrays.sort(array2);
        for(int i =0; i<array[0].length(); i++){
            if(array1[i]==array2[i]) continue;
            else{
                result = 'F';
                break;
            }
        }
        return result;
    }
}
