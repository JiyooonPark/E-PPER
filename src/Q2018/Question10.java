package Q2018;

import java.util.Scanner;

public class Question10 {
    public static void main(String [] args){

        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int rel = scanner.nextInt();

        int [] values= new int[size];
        int [][] relations = new int[rel][2];

        for(int i=0; i<size;i++){
            values[i]=scanner.nextInt();
        }
        for(int i=0; i<rel;i++){
            relations[i][0]=scanner.nextInt();
            relations[i][1]=scanner.nextInt();
        }
        int goal = scanner.nextInt();

        int time =timeManagement(values, relations, goal);
        System.out.println(time);

    }
    private static void solution(int [] values, int [][] relations){
     //   int total = timeManagement(values, relation, )
    }
    private static int timeManagement(int [] values, int[][] relation, int goal){
       // System.out.println("------------------------------------[ "+ goal + " ]------------------------------------------");
        int total=0;
        int [] t ;
        int j=0;
        int big=0;
        for(int i=0; i<relation.length;i++){
            if(relation[i][1]==goal){
                total +=1;
            }
        }
        //System.out.println(goal+"가 "+total+"개 있습니다.");
        t= new int [total];

        for(int i=0; i<relation.length;i++){
            if(goal==1) {
        //        System.out.println("1번쨰이므로 바로 return");
                return values[0];
            }
            if(relation[i][1]==goal){
                t[j++] = timeManagement(values, relation, relation[i][0]);
        //        System.out.println(goal+"번째 :"+t[j-1]);
            }
        }
        big = t[0];
       // System.out.print(goal + "의 돌아온 값은 : ");
        for(int i=0; i<total ; i++) {
        //    System.out.print(t[i]+" ");
            if (big < t[i]) {
                big = t[i];
            }
        }
        //System.out.println(goal+"에서 가장 큰 값은 "+big );
        return big+values[goal-1];
    }
}
/*4 4
10 20 100 20
1 2
1 3
2 4
3 4*/