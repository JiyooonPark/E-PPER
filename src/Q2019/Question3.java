package Q2019;

import java.util.Scanner;

public class Question3 {
    public static void main (String [] args){
        String words[] = getWords();
        if(checkWords(words)) {
            String wordsSplit[][] = splitWord(words);
            boolean value = organizeWord(wordsSplit);
            printResult(value);
        }
        else{
            printResult(false);
        }

    }
    public static String[] getWords(){
        Scanner scanner = new Scanner(System.in);
        String array[] = new String[2];
        System.out.println("input two words separated by a space");
        array[0] = scanner.next();
        array[1] = scanner.next();

        return array;
    }
    public static boolean checkWords(String array[]){
        if (array[0].length() == array[1].length()) return true;
        else return false;
    }
    public static String[][] splitWord(String [] array){
        String wordArray[][]=new String[2][array[0].length()];
        for(int i=0; i<2; i++){
            for(int j=0; j<array[i].length();j++){
                wordArray[i][j]=array[i].substring(j,j+1);
                //System.out.println(wordArray[i][j]);
            }
           // System.out.println();
        }
        return wordArray;
    }
    public static boolean organizeWord(String [][] array){
        String tempLis[] =new String[20];
        String temp;
        int same=0;
        int len = array[1].length;
        if(array[0].length != array[1].length) return false;
        else{
            //for(int i =0; i<len;i++){System.out.println(i);}
            for(int i =0; i<len;i++){
                for(int j=0; j<len;j++){
                    //System.out.println("i: "+i+" j: "+j+" " +array[0][i]+ " : "+array[1][j]);
                    if(array[0][i].compareToIgnoreCase(array[1][j])==0){
                        same++;
                        break;
                    }
                    else continue;
                }
            }
            //System.out.println(same);
            if(same ==len) return true;
            else return false;
        }
    }
    public static void printResult(boolean v){
        if(v) System.out.println("T");
        else System.out.println("F");
    }
}
