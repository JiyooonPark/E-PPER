package PI_session;

import java.util.*;

public class Q2019_3_2 {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        String array [] = new String[2];
        array[0]=scanner.next();
        array[1] = scanner.next();
        char result = solution1(array);
        System.out.print(result);

    }

    private static char solution1(String[] array) {
        array[0] = array[0].toLowerCase();
        array[1] = array[1].toLowerCase();
        char word1[] = array[0].toCharArray();
        char word2[] = array[1].toCharArray();

        Arrays.sort(word1);
        Arrays.sort(word2);

        String a = String.valueOf(word1);
        String b = String.valueOf(word2);

        if(a.equals(b)) return 'T';
        else return 'F';

    }
}
