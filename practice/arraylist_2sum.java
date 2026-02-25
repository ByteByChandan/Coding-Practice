import java.util.*;
class checkinnng{
    public void Twosum(ArrayList<Integer>arr,int sum){
        int Value_i=0;
        int value_j=0;
        for(int i=0;i<5;i++){
            for(int j=1;j<6;j++){
                if(arr.get(i)+arr.get(j)==sum){
                    value_j= arr.get(j);
                    Value_i=arr.get(i);
                }
            }
        }
        System.out.print("Your target sum Index is: "+value_j+" "+Value_i);
    }
}
public class arraylist_2sum {
    public static void main(String []args){
        Scanner sc =new Scanner(System.in);
        ArrayList<Integer>arr=new ArrayList<>();
        System.out.print("Enter your array elements: ");
        for(int i =0;i<6;i++){
            arr.add(sc.nextInt());

        }
        for(int i =0;i< arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }
        System.out.println("Enter your value of sum: ");
        int sum=sc.nextInt();
        checkinnng obj=new checkinnng();
        //.Twosum(ArrayList<Integer>arr,sum);
        obj.Twosum(arr,sum);

    }
}
