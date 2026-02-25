import java.util.*;

public class arraylist_2sum {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        System.out.print("Enter your array elements: ");
        for(int i =0;i<6;i++){
            arr.add(sc.nextInt());

        }
        for(int i =0;i< arr.size();i++){
            System.out.print(arr.get(i));
        }
    }
}
