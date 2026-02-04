import java.util.*;
class sub{
    public void All_substring(String s){
        String str=s;
        for(int i=0;i<=str.length()-1;i++){
            for(int j=i+1;j<=str.length();j++){
                System.out.print(" "+ str.substring(i,j));
            }
        }
    }
}


class print_allSubStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String S = sc.nextLine();
        sub obj=new sub();
        obj.All_substring(S);
    }
}
