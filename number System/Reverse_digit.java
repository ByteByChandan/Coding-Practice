import java.util.Scanner;
class  rev{
    public int number_reverse (int num){
        int n=num;
        int temp=0;
        while (n!=0) {
            int digit=n%10;
            temp=temp*10+digit;
            n=n/10;
        }
        return temp;
        
    }
}
class reverse_digit {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your Number: ");
        int number=sc.nextInt();
        rev obj=new rev();
        int reverse=obj.number_reverse(number);
        System.out.println("The reverse Number is: "+reverse);
        sc.close();
    }
    
}
