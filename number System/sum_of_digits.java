import java.util.Scanner;
class Digit_sum{
    public int sum(int n){
        int number=n;
        int temp=0;
        while(number!=0){
            //int digit=number%10;
            temp=temp+(number%10);
            number=number/10;
        }
        return temp;
    }
}



class sum_of_digits{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your Number: ");
        int Number=sc.nextInt(); 
        Digit_sum obj=new Digit_sum();
        int output=obj.sum(Number);
        System.out.println("Your sum of digits is: "+output);

    }
}