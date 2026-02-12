import java.util.*;
class Checkking {

    public void Armstrong(int num){

        int temp;
        int n = num;
        int count = 0;

        // Count digits
        while(n != 0){
            count++;
            n = n / 10;
        }

        n = num;  // Reset n
        int armst = 0;

        // Calculate Armstrong sum
        while(n != 0){
            temp = n % 10;
            armst += Math.pow(temp, count);
            n = n / 10;
        }

        // Compare with original number
        if(armst == num){
            System.out.println("Your number is Armstrong number");
        } else {
            System.out.println("Your number is not an Armstrong number");
        }
    }
}

public class armStrong_number {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int num=sc.nextInt();
        Checkking obj=new Checkking();
        obj.Armstrong(num);
    }
}
