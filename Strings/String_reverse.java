import java.util.*;
class str{
    public String Str_rev(String s){
        String s1=s;
        String reverse="";
        for(int i=0;i<s1.length();i++){
            reverse=s1.charAt(i)+reverse;
        }
        return reverse;
    }
}
public class String_reverse {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your String:");
        String str=sc.nextLine();
        str obj =new str();
        String reverse=obj.Str_rev(str);
        System.out.print("your reverse String is: "+reverse);
    }
}
