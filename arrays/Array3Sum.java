import java.util.Scanner;
class Three_sum{
    public int []calculation(int []arr,int n){
        int target=n;
        //int possible_pairs=0;
        for(int i=0;i<arr.length;i++){
            for(int j =i+1;j<arr.length-1;j++){
                for(int z=j+1;z<arr.length-2;z++){
                    if(arr[i]+arr[j]+arr[z]== target){
                        //possible_pairs++;
                        return new int [] {arr[i],arr[j],arr[z]};
                    }
                }
            }
        }
        //System.out.print("possible pairs is: "+possible_pairs);
        return null;
    }
        }
public class Array3Sum {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Size of array: ");
        int S=sc.nextInt();
        int []arr=new int [S];
        System.out.print("Enter your Array elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your target Sum: ");
        int sum=sc.nextInt();
        Three_sum obj=new Three_sum();
        int []jrr=obj.calculation(arr,sum);
        if(jrr!=null){
            System.out.print("Your target Sum "+ sum +" values form array is "+jrr[0]+", "+jrr[1]+", "+jrr[2] );
        }
        else{
            System.out.print("In the array the system could not find any pair");
        }
    }
}
