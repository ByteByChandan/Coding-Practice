import java.util.Scanner;

public class Remove_vowels {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        StringBuffer sb= new StringBuffer(s);
        for(int i =0;i<sb.length();i++){
            char x=sb.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                sb.deleteCharAt(i);
                i--;
            }
        }

        System.out.print(sb);
    }
}
