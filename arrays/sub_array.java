import java.util.Scanner;
class Arrrray{
    public void finding_subarray(int []arr){
        int z=0;
        int []jrr=new int[arr.length];
        for(int i =0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                for(int y=i;y<=j;y++) {
                    System.out.print(arr[y] + " ");
                }
                System.out.println();
            }
        }
    }
}
class sub_array {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int S=sc.nextInt();
        int []arr=new int[S];
        System.out.println("Enter your array Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        Arrrray obj =new Arrrray();
        obj.finding_subarray(arr);
    }
}
