import java.util.Scanner;

public class reverseingArray {
    static void  reverseing(int []arr){
        int []jrr= new int[arr.length];
        int z=0;
        for(int i=arr.length-1;i>=0;i--){
            jrr[z++]=arr[i];
        }
        for(int y=0;y< arr.length;y++){
            System.out.print(jrr[y]+ " ");
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int []arr = new int[6];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        reverseing(arr);
    }
}
