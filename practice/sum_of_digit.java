import java.util.*;
public class sum_of_digit {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int temp=0;
        int sum=0;
        int num=sc.nextInt();
        try{
            while(num!=0){
                temp=num%10;
                sum+=temp;
                num/=10;

            }
            System.out.print(sum);
        }
        catch (Exception e){
            System.out.print("plea1se enter integer value");
        }

    }
}
