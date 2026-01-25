import java.util.Scanner;
class beauty{
    public int beautiful_count(int[]arr){
        int count=0;
        int nextElement=0;

//        while (nextElement!=0){
////            temp=nextElement%10;
////            nextElement=nextElement/10;
////            temp+=nextElement;
//            temp=temp+(nextElement%10);
//            nextElement=nextElement/10;
//        }
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                nextElement=arr[j];
                int temp = 0;
                    while (nextElement != 0) {
                        temp = temp + (nextElement % 10);
                        nextElement = nextElement / 10;
                    }
                    if (arr[i] < temp) {
                    count++;
                }
                }
        }
        return count;
    }
}
public class beautiful {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the size of your array:");
        int size= sc.nextInt();
        int []arr=new int [size];
        System.out.print("Enter your array elements: ");
        for(int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        beauty obj =new beauty();
        int result=obj.beautiful_count(arr);
        System.out.println(result);
    }
}
