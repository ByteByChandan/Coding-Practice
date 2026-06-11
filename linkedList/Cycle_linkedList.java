import java.util.Scanner;

public class Cycle_linkedList {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head=null;
        node tail=null;
        void insert(int data){
            node temp=new node(data);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        void display(){
            node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        linkedlist ll =new linkedlist();
        System.out.print("Enter your linkedlist elements: ");
        for(int i=1;i<=5;i++){
            ll.insert(sc.nextInt());
        }
        ll.display();



    }
}
