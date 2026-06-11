import java.util.*;

public class Delete_nth_node_from_end {
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
        void add(int data){
            node temp = new node(data);
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
        void RemoveNthElementFromlast(int idx){
           node slow=head;
           node fast=head;
           node temp=head;
           for(int i=1;i<=idx;i++){
               fast=fast.next;
           }
           if(fast==null){
               head=head.next;
               return;
           }
           while(fast.next!=null){
               slow=slow.next;
               fast=fast.next;
           }
           slow.next=slow.next.next;
        }
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        linkedlist ll = new linkedlist();
        ll.add(45);
        ll.add(78);
        ll.add(21);
        ll.add(13);
        ll.add(98);
        ll.display();
        ll.RemoveNthElementFromlast(2);
        ll.display();
    }
}
