import java.util.*;
public class Concatenate_one_string_to_another {
        public static void main(String[] args) {
//            String str1 = "Hello";
//            String str2 = " World";
//
//            String result = str1.concat(str2);
//
//            System.out.println(result);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your First string: ");
            String str1=sc.nextLine();
            System.out.println("Enter your Sceond String: ");
            String str2=sc.nextLine();

            String new_str=str1.concat(str2);
            System.out.println(" After the concatination the new String is: "+new_str);
        }
    }

