/*A chocolate factory is packing chocolates into the packets. The chocolate packets here represent an array  of N number of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor belt(array).
 Example 1 :
 N=8 and arr = [4,5,0,1,9,0,5,0].
 There are 3 empty packets in the given set. These 3 empty packets represented as O should be pushed towards the end of the array*/
import java.util.Scanner;
class chocolate{
    public int [] chocolate_count(int []arr){
        int []chocolate = new int[arr.length];
        int j=0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]!=0){
                chocolate[j++]=arr[i];
            }
        }
        for(int z=j;z< chocolate.length;z++){
            chocolate[z]=0;
        }
        return chocolate;
    }
}
class Chocolate_factory {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Size of an array: ");
        int s=sc.nextInt();
        int []arr=new int[s];
        System.out.println("Enter your elements in your array: ");
        for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        }
        chocolate obj = new chocolate();
        int []chocolate_list=obj.chocolate_count(arr);
        for(int j=0;j<chocolate_list.length;j++){
            System.out.print(chocolate_list[j]+" ");
        }
    }
}
