import java.util.*;
public class String_basics {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your 1st String:");
        String str=sc.nextLine();
        System.out.print("Enter your 2nd String:");
        String str2=sc.nextLine();
        System.out.println("convert the string into lowercase: "+str.toLowerCase());
        System.out.println("convert the string into uppercase: "+str.toUpperCase());
        System.out.println("concatinate two strings(string1 + string2): "+str.concat(str2));
        System.out.println("Check the Exact Index of a particular character: "+str.indexOf("d"));
        System.out.println("Fetch a particular character form the String :"+str.charAt(3));
        System.out.println("Compare the two strings: "+str.compareTo(str2));
        System.out.println("Check a substring is contain in the main String or not: "+str.contains(str2));
        sc.close();
    }
}
