import java.util.Scanner;

public class ArraySorting  {
    static void afterSorting(int [] arr){
        int tem=0;
        for(int i =0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<=arr[j]){
                    tem=arr[i];
                    arr[i]=arr[j];
                    arr[j]=tem;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        }
    }
    public static  void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []arr=new int[6];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        afterSorting(arr);
    }
}
