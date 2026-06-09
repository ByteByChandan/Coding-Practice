package Linkedlist_practice;

public class linkedlist_practice2 {
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
        void instert(int value){
            node temp=new node(value);
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
        int size(){
            int count=0;
            node temp=head;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }
        void insertAtbegining(int value){
            node temp = new node (value);
            //node t=head;
            if(head==null){
              head=temp;
              tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }
        void insert(int value,int idx){
            node temp = new node (value);
            node t=head;
            for(int i =1;i<=idx-1;i++){
                t=t.next;
            }
            temp.next=t.next;
            t.next=temp;
            if(idx==0){
                insertAtbegining(value);
            }
             else if (idx<0|| idx>size()) {
            System.out.print("Invaild index");
        }
             else if(idx==size()){
                instert(value);
            }

        }

    }
    public static void main(String []args){
        linkedlist ll=new linkedlist();
        ll.instert(5);
        ll.instert(7);
        ll.instert(887);
        ll.display();
        int size=ll.size();
        System.out.println("your size of a linkedlist is: "+size);
        ll.insertAtbegining(0);
        ll.display();
        ll.insert(54,2);
        ll.display();
    }
}
