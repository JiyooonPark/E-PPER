package Q2018;

import java.util.Scanner;

public class Question3 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.next();
        char c;
        for(int i=0; i<sentence.length(); i++){
            c=sentence.charAt(i);
            if(c>='A' && c<='Z'){
                System.out.print(c);
            }
        }
    }
}
