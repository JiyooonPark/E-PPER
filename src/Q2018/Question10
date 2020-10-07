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
        int time =timeManagement(values, relations, size);
        System.out.println(time);

    }
    private static void solution(int [] values, int [][] relations){
     //   int total = timeManagement(values, relation, )
    }
    private static int timeManagement(int [] values, int[][] relation, int cur){
        int total=0;
        int [] t ;
        int j=0;
        int big=0;
        for(int i=0; i<relation.length;i++){
            if(relation[i][1]==cur){
                total +=1;
            }
        }
        System.out.println(cur+"가 "+total+"개 있습니다.");
        t= new int [total];

        for(int i=0; i<relation.length;i++){
            if(cur==1) return values[0];
            if(relation[i][1]==cur){
                t[j++] = timeManagement(values, relation, cur-1);
                System.out.println(t[j-1]);
            }
        }
        big = t[0];
        System.out.print("돌아온 값은 : ");
        for(int i=0; i<total ; i++) {
            System.out.print(t[i]+" ");
            if (big < t[i]) {
                big = t[i];
            }
        }
        return big+values[cur-1];
    }
}
