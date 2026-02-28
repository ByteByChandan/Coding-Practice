import java.util.Scanner;
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
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]);
        }
    }
}
