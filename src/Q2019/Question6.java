package Q2019;
import java.util.Scanner;

public class Question6 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        double xNew=0, yNew=0;

        if(x==0){
            yNew = 250*250*0.5/(250-x);
            xNew = 250-yNew;
        }
        else if(y==0){
            xNew = 250*250*0.5/(250-y);
            yNew = 250-xNew;
        }
        else if(x==125){
            xNew = 0;
            yNew =0;
        }
        else if(x>125){
            xNew=0;
            yNew = 2*(250*250*0.5)/x-250;
        }
        else if(x>125){
            yNew=0;
            xNew = 2*(250*250*0.5)/x-250;
        }
        System.out.println(xNew+" "+yNew);
    }
}
