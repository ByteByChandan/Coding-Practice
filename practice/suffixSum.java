import java.util.*;
public class suffixSum {
    static void Ssum(int []arr){
        int x=arr.length;
        arr[0]=arr[x-1];
        //int z=1;
        for(int i=x-2;i>=0;i--){
            arr[i]=arr[i+1]+arr[i];
        }
        for(int i=0;i<x;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        String s= sc.nextLine();
        String []str=s.split(",");
        int []arr=new int [str.length];
        for(int i =0;i<str.length;i++){
            arr[i]=Integer.parseInt(str[i]);
        }
        Ssum(arr);
    }
}
