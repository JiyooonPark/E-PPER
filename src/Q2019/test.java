package Q2019;

public class test {
    public static void main(String [] args){
        int a[] ={0,1,2,3,4,4,5};
        print(a);
        ac(a);
        print(a);

    }
    public static void print(int [] a){
        for(int i=0; i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    public static void ac(int[] a){
        a[0]=100;
    }
}
