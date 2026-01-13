import java.util.Scanner;
class Find_number{
    public int Search_number(int arr[]){
        int largenumber=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largenumber){
                largenumber=arr[i];
            }
        }
        return largenumber;
    }
}
public class Largest_number {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int []arr=new int [5];
        System.out.println("Please enter your array: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Find_number obj=new Find_number();
        int Larger_value=obj.Search_number(arr);
        System.out.println("Your LArge Element Form this array is : "+Larger_value);    
    }
}
