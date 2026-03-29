import java.util.Scanner;
public class Leap_year {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int year=sc.nextInt();
        if(year%100==0 && year%400==0){
            System.out.print("Your year is leap year");
        }
        else if(year%100!=0 && year%4==0){
            System.out.print("Your year is leap year");
        }
        else{
            System.out.print("your year is not a leap year");
        }
    }
}
