import java.util.Scanner;
class THREESUM{
    public int [] result(int []arr,int n){
        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int z=j+1;z<arr.length;z++){
                    if(arr[i]+arr[j]+arr[z]==n){
                        return new int [] {arr[i],arr[j],arr[z]};
                    }
                }
            }
        }
        return null;
    }
}
public class practicce2 {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your array Seprated by coma: ");
        String s=sc.nextLine();
        String [] input=s.split(",");
        int []array=new int[input.length];
        for(int i =0;i<array.length;i++){
            array[i]=Integer.parseInt(input[i].trim());
        }
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]);
//        }
        System.out.print("Enter your target: ");
        int terget=sc.nextInt();
        THREESUM obj=new THREESUM();
        int [] arr=obj.result(array,terget);
        int[] result = obj.result(array, terget);

        if (result != null) {
            System.out.println("Your result is: " + result[0] + " " + result[1] + " " + result[2]);
        } else {
            System.out.println("No combination found.");
        }
    }
}
