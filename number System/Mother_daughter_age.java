import java.util.Scanner;

class Mother_daughter_age {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Mother age: ");
        int mage=sc.nextInt();
        System.out.println("Enter your Daughter age: ");
        int dage=sc.nextInt();
        int gap=mage-(2*dage);
        System.out.println("the gap will be: "+gap);
    }
}
