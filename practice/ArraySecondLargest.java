import java.util.Scanner;
public class ArraySecondLargest {
    static void sceondElements(int []arr){
        int sceond=Integer.MIN_VALUE;
        int first=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                sceond=first;
                first=arr[i];
            }
            else if (arr[i] > sceond && arr[i] != first) {
                sceond = arr[i];
            }
        }
        System.out.println(sceond);
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int []arr=new int[size];
        for(int i =0;i< arr.length;i++){
            arr[i]= sc.nextInt();
        }
        sceondElements(arr);
    }
}
