import java.util.*;

public class Taking_input {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your n:");
        int n=sc.nextInt();
        ArrayList<Integer>arr=new ArrayList<>(n);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        for(int i=0;i<5;i++){
            arr.add(sc.nextInt());
        }
        for(int i=0;i<arr.size();i++){
            System.out.println(arr.get(i));
        }
    }
}
