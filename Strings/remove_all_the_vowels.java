import java.util.*;
class remove_all_the_vowels {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your String/sentence: ");
        String s=sc.nextLine();
        StringBuilder str = new StringBuilder(s);

        for(int i=0;i<str.length();i++){
            char l=str.charAt(i);
            if(l=='a'||l=='A' ||l=='e'||l=='E'||l=='i'||l=='o'||l=='O'||l=='u'||l=='U' ){
                str.deleteCharAt(i);
            }
        }
        System.out.println("After removing vowels form string become: "+str);

    }
}
