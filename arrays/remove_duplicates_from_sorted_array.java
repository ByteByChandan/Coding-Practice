import java.util.*;
class remove{
    public int [] RemoveDuplicates(int []arr){
        int []jrr=new int[arr.length];
        int z=0;
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    jrr[z++]=arr[i];
                }
            }
        }
        return jrr;
    }
}
public class remove_duplicates_from_sorted_array {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter your array size: ");
        int num = sc.nextInt();
        int []arr=new int[num];
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        remove obj = new remove();
        int [] zrr=obj.RemoveDuplicates(arr);
        System.out.println("After removing duplicates the array is : ");
        for(int j=0;j<arr.length;j++){
            System.out.println(zrr[j]);
        }
    }
}
