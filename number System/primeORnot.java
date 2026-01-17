import java.util.*;
class prime{
    public void checking(int number){
        int v=number;
        double root=Math.ceil(Math.sqrt(v));
        if(v<=1){
            System.out.println("It is not a Prime number");
        }
        boolean isPrime=true;
        for(int i=2;i<=root;i++) {
            if (v % i == 0) {
                isPrime = false;
                break;
            }
            else{
                isPrime=true;
            }
        }
            if(isPrime){
                System.out.println("the number is prime");
            }
            else{
                System.out.println("The number is not prime");
            }

    }
}
public class primeORnot {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your number: ");
        int number=sc.nextInt();
        prime obj=new prime();
        obj.checking(number);

    }
}
