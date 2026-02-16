import java.util.Scanner;
public class roots_of_a_Quadratic_Equation {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value of 'a': ");
        double a=sc.nextDouble();
        System.out.println("Enter your value of 'b': ");
        double b=sc.nextDouble();
        System.out.println("Enter your value of 'c': ");
        double c=sc.nextDouble();

        double D = b*b - 4*a*c;

        if (D > 0) {
            double root1 = (-b + Math.sqrt(D)) / (2*a);
            double root2 = (-b - Math.sqrt(D)) / (2*a);
            System.out.println("Roots are real and different:");
            System.out.println(root1 + " , " + root2);
        }
        else if (D == 0) {
            double root = -b / (2*a);
            System.out.println("Roots are real and equal:");
            System.out.println(root);
        }
        else {
            double realPart = -b / (2*a);
            double imaginaryPart = Math.sqrt(-D) / (2*a);
            System.out.println("Roots are complex:");
            System.out.println(realPart + " + " + imaginaryPart + "i");
            System.out.println(realPart + " - " + imaginaryPart + "i");
        }

    }
}
