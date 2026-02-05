import java.util.*;
//class counting{
//    public void elements(String s){
//        StringBuffer str=s;
//    }
//}
class count_elements {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Sentence: ");
        String s= sc.nextLine();
        StringBuffer str=new StringBuffer(s);
        int vowel=0;
        int consonent=0;
        int spaces=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U'){
                vowel+=1;
            } else if (ch == ' ') {
                spaces++;
            }
            else{
                consonent++;
            }
        }
        System.out.println("In your sentence number of vowels is:"+ vowel);
        System.out.println("In your sentence number of spaces is:"+ spaces);
        System.out.println("In your sentence number of consonent is:"+ consonent);
    }
}
