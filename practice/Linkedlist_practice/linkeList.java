import java.util.*;
public class linkeList {
    static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        };

    }
    public static void main(String []args){
        node a= new node(2);
        node b= new node(7);
        node c= new node(12);
        node d= new node(24);
        node e= new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
         node temp=a;
         while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
         }
    }
}
