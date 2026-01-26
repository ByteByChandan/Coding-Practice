import java.util.*;
public class Circle_area {
    public static void main(String []args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your radios of circle: ");
        int r=sc.nextInt();
        double area=Math.PI*Math.pow(r,2);
        System.out.print("the are of your circle is: "+Math.round(area)+" approx");
    }
}
