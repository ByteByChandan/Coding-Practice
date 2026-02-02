import java.util.*;
class String_buffer {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your String: ");
        String S=  sc.nextLine();
        StringBuffer str1 = new StringBuffer(S);
        StringBuffer Result =str1.reverse();
        System.out.println("Reverse String is : "+Result);
        StringBuffer str2= new StringBuffer("Hello");
        str2.append("World");
        System.out.println("Use of append keyword: "+str2);
        str2.setCharAt(2,'Y');
        System.out.println("Use of setCharAt keyword: "+str2);
        str2.insert(3,'A');
        System.out.print("Use of insert keywor: "+str2);
    }
}
