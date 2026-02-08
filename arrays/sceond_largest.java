import java.util.Scanner;
class finding{
    public int second_largest(int []arr){
        int largest=0;
        int second=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>largest){
                second=largest;
                largest=arr[i];

            }
        }
        return second;
    }
}
class sceond_largest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your array size: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.println("Enter your array elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        finding obj=new finding();
        int result=obj.second_largest(arr);
        System.out.println("Your second largest element is: "+result);
    }
}
