
public class delete_middle_element {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        node head= null;
        node tail=null;
        void add(int data){
            node temp= new node(data);
            if(head==null){
                head= temp;
            }
            else {
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

        void leftMiddle(){
            node fast=head.next;
            node slow=head;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.print("Left Middle of the element is : "+ slow.data);
            System.out.println();
        }

        void rightMiddle(){
            node slow =head;
            node fast=head;
            while(fast!=null&& fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.print("Right Middle of the element is : "+ slow.data);

        }
    }
    public static void main(String []args){
        linkedlist ll= new linkedlist();
        ll.add(56);
        ll.add(67);
        ll.add(12);
        ll.add(76);
        ll.add(89);
        ll.add(100);
        ll.display();
        ll.leftMiddle();
        ll.rightMiddle();

    }
}
