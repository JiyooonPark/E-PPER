package Q2019;

public class programmers {
    public static void main(String [] args){
        int a[][] = {{1,4}, {3,4}, {3,10}};

        //System.out.print(solution(a));
    }

        public static int[] solution(int[][] v) {

            int[] answer = {0,0};
            int [] x=new int [3];
            int [] y=new int [3];
            for(int i=0; i<3;i++){
                x[i]=v[i][0];
                y[i]=v[i][1];
            }
            if(x[0]==x[1]) answer[0]=x[2];
            else if(x[0]==x[2]) answer[0]=x[1];
            else answer[0]=x[0];

            if(y[0]==y[1]) answer[0]=y[2];
            else if(x[0]==y[2]) answer[0]=y[1];
            else answer[0]=y[0];
            System.out.println(answer[0]+" " +answer[1]);
            return answer;
        }
}
