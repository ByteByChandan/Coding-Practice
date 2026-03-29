import java.util.*;
public class primeCheck {
    static boolean isPrime(int number){
        for(int i =2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int number=sc.nextInt();
        boolean r=isPrime(number);
        if(r==true){
            System.out.print("Your number is prime number");
        }
        else{
            System.out.print("Your number is not a prime number");
        }

    }
}
