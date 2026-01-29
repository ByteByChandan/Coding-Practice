import java.util.*;
class sttt{
    public void trimmig(String S){
        String s=S;
        System.out.print( "The original String is : "+s);
        System.out.println();
        System.out.print( "After The remove all spaces from String is : "+s.replace(" ",""));
        System.out.println();
        System.out.print( "After the trimming and convert to upper case then String is : "+s.toUpperCase().trim());


    }
}
public class trim {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your string with wide spaces and all: ");
        String str =sc.nextLine();
        sttt obj = new sttt();
        obj.trimmig(str);

    }
}
