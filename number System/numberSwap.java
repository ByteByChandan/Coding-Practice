import java.util.Scanner;
class swapping{
    public int [] Number_swapping(int a,int b){
        int temp=0;
        int A=a;
        int B=b;
        temp=A;
        A=B;
        B=temp;
        return new int []{A, B};
    }
}
public class numberSwap {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your 1st variable,Which is Store in A :");
        int A=sc.nextInt();
        System.out.print("Enter your 2nd variable,Which is Store in B :");
        int B=sc.nextInt();
        swapping obj =new swapping();
        int[] arr=obj.Number_swapping(A,B);
        System.out.print("your 1st element A is after swap: "+arr[0]);
        System.out.println();
        System.out.print("your 2nd element B is after swap: "+arr[1]);

    }
}
