import java.util.Scanner;
class Occurrence{
    public int CountOccurrence(int [] arr,int n){
        int count=0;
        //int number=n;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==n){
                count++;
            }
        }
        return count;
    }
}
class numberOfOccurrence {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your array size: ");
        int num=sc.nextInt();
        int []arr=new int[num];
        System.out.print("Please enter your array:");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your desire number that you want to find the number of occurrence in the array:");
        int digit=sc.nextInt();
        Occurrence obj = new Occurrence();
       int result= obj.CountOccurrence(arr,digit);
       System.out.print("your desire number of occurrence is in your given array: "+result);
    }
}
