import java.util.*;
class Toggel_letters {
public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String: ");
        String s=sc.nextLine();
        StringBuffer str= new StringBuffer(s);
        for(int i=0;i<str.length();i++){
                int ascii=(int)str.charAt(i);
                char ch = str.charAt(i);
                boolean flag=true;
                if (ascii>=97){
                        flag=false;
                }
                if(ch== ' '){
                        continue;
                }
                if(flag==true){
                        ascii+=32;
                        char dh=(char)ascii;
                        str.setCharAt(i,dh);
                }
                else{
                        ascii-=32;
                        char dh=(char)ascii;
                        str.setCharAt(i,dh);
                }
        }
        System.out.print("after toggel is done: "+str);

    }
}
