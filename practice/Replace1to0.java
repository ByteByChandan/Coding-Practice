import java.util.*;
class Main{
    public void num(int []arr){
        for(int i =0;i<arr.length;i++){
            if (arr[i]==0){
                arr[i]=1;
            }
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void Replace1to0(String[] args){
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        String []Str=s.split(" ");
        int []arr=new int[Str.length];
        for(int i=0;i<Str.length;i++){
            arr[i]=Integer.parseInt(Str[i]);
        }
        Main obj =new Main();
        obj.num(arr);
    }
}

