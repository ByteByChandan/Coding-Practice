import java.util.*;
public class StringToInteger {
    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, n = s.length();
        long num = 0;
        if (s.charAt(0) == '-' || s.charAt(0) == '+') {
            sign = (s.charAt(0) == '-') ? -1 : 1;
            i++;
        }
        while (i < n && Character.isDigit(s.charAt(i))) {
            num = num * 10 + (s.charAt(i) - '0');
            if (sign * num < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            if (sign * num > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            i++;
        }
        return (int) (sign * num);
    }
    public static void main(String []agrs){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s=sc.nextLine();
        StringBuffer str=new StringBuffer(s);
        myAtoi(s);
    }
}