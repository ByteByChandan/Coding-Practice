import java.util.Scanner;
class rotation{
    public int[] Array_rotate(int []arr,int A){
        int rotation=A% arr.length;
        int []jrr=new int[arr.length];
        int z=0;
        for(int i =rotation;i<jrr.length;i++){
                jrr[z++]=arr[i];
        }
        //int new_size=z- arr.length;
        for(int x=0;x<rotation;x++){
          jrr[z++] =arr[x];
        }
        return jrr;
    }
}
public class array_rotation {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your size of your array: ");
        int size=sc.nextInt();
        int []arr=new int[size];
        System.out.print("Enter your array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter your array index ,from where your want to rotate: ");
        int R=sc.nextInt();
        rotation obj=new rotation();
        int []xrr= obj.Array_rotate(arr,R);
        System.out.print("Your new rotated array is: ");
        for(int y=0;y<arr.length;y++){
            System.out.print(xrr[y]);
        }
    }
}
