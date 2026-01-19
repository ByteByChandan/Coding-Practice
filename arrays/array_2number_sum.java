import java.util.Scanner;
class Arrays_sum{
    int [] Find_sum(int []arr,int n){
       // int[]jrr=new int[2];
        for(int i =0;i<arr.length;i++){
            for(int j =1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==n){
                   //int [] jrr=new int[2] {arr[i],arr[j]};
                    return new int[]{arr[i], arr[j]};

                }

            }
        }
        return null;

    }
}
public class array_2number_sum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your array size:");
        int size=sc.nextInt();
        int []arr=new int [size];
        System.out.print("Enter your arrays Element:");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter your number that you want to find sum of element in array: ");
        int Sum=sc.nextInt();
        Arrays_sum obj =new Arrays_sum();
        int []crr =obj.Find_sum(arr,Sum);
        if(crr!=null){
            System.out.println("The sum of the two elements is: " + crr[0] + " + " + crr[1] + " = " + Sum);

        }
        else{
            System.out.print("In the array the system could not find any pair");
            }
        }
    }

