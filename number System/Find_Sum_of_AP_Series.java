import java.util.Scanner;
class summy{
    public int ApSum(int fst,int r,int diff){
        int sum=0;
        int i=0;
        while (i!=r){
            sum+=fst;
            fst+=diff;
            i++;
        }
        return sum;
    }
}

public class Find_Sum_of_AP_Series  {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);

        System.out.print("enter your first term : ");
        int fst=sc.nextInt();

        System.out.print("enter your range: ");
        int r=sc.nextInt();

        System.out.print("enter your common difference: ");
        int diff=sc.nextInt();

        summy obj=new summy();
        int result= obj.ApSum(fst,r,diff);
        System.out.println("Sum of the AP Series is = "+result);
    }
}
