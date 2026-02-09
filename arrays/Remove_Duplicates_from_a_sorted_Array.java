import java.util.Scanner;
 class removee{
     public void duplicates(int []arr){
         int []jrr = new int[arr.length];
         int z=0;
         jrr[z]=arr[0];
         for(int i=1;i<arr.length;i++){
             if(jrr[z]!=arr[i]){
                 z++;
                 jrr[z]=arr[i];
              }
         }
         for(int y=0;y<z+1;y++){
             System.out.print(jrr[y]+" ");
         }

     }

}
public class Remove_Duplicates_from_a_sorted_Array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int size=sc.nextInt();
        int []arr= new int[size];
        System.out.print("enter your array elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        removee obj=new removee();
        obj.duplicates(arr);

        }
    }

