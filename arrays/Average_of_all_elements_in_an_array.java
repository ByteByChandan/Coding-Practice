import java.util.Scanner;
class Average{
    int Average_Elements (int []arr){
        int sum=arr[0];
        int count =arr.length;

        for(int i =0;i<arr.length;i++){
          sum+=arr[i];
        }

        return  sum/count;
    }
}
public class Average_of_all_elements_in_an_array {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int S=sc.nextInt();
        int []arr=new int[S];
        System.out.print("Enter your Array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Average obj=new Average();
        int average1=obj.Average_Elements(arr);
        System.out.print("Average of all elements in an array is: "+average1);
    }
}
