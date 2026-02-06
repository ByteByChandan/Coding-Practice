import java.util.*;
class remove_all_the_spaces {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your string/sentences: ");
        String s=sc.nextLine();
        StringBuilder str= new StringBuilder(s);
        for(int i =0;i<str.length();i++){
            char sp=str.charAt(i);
            if (sp == ' ') {
                str.deleteCharAt(i);
                i--;
            }
        }
        System.out.println("After removing space your string is: "+str);
    }
}
