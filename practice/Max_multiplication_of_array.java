import java.util.*;
class Max_multiplication_of_array {
    static int Multiplication(int []arr){
        int Max_negative=Integer.MIN_VALUE;
        int count_Zeros=0;
        int count_neg=0;
        int mul=1;
        int n=arr.length;
        if(n==1){
            return arr[0];
        }
        for(int i=0;i<n;i++){
            int x=arr[i];
            if(x==0){
                count_Zeros++;
                continue;
            }
            if(x<0){
                Max_negative=Math.max(Max_negative,x);
                count_neg++;

            }
            mul*=x;
        }
        if(count_Zeros==n){
            return 0;
        }
        if(count_neg%2==1){
            if(count_neg==1 && count_neg+count_Zeros==n){
                return 0;
            }
            mul/=Max_negative;
        }
        return mul;
    }
     public static void main(String []args){
         Scanner sc = new Scanner(System.in);
         int n =sc.nextInt();
         int []arr = new int[n];
         for(int i =0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        int result=Multiplication(arr);
         System.out.print(result);
     }
}
