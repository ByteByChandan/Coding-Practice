import java.util.*;
class find_ascii {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your Character: ");
        char ch = sc.next().charAt(0);
        int value=ch;
        System.out.println("the ascii value of your character is: "+value);
    }
}
