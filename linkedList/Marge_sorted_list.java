public class Marge_sorted_list {
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
        void marge(node head1,node head2){
            node temp1=head1;
            node temp2=head2;
            node h=new node(100);
            node temp3=h;
            while(temp1!=null && temp2!=null){
                if(temp1.data<temp2.data){
                    node a =new node(temp1.data);
                    temp3.next=a;
                    temp3=a;
                    temp1=temp1.next;
                }
                else{
                    node b= new node(temp2.data);
                    temp3.next=b;
                    temp3=b;
                    temp2=temp2.next;
                }
            }
            if(temp1==null){
                temp3.next=temp2;
            }
            else{
                temp3.next= temp1;
            }
            node temp = h.next;
            while(temp != null){
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        linkedlist ll1= new linkedlist();
        linkedlist ll2= new linkedlist();
        ll1.add(1);
        ll1.add(3);
        ll1.add(5);
        ll1.add(7);
        ll1.add(9);
        ll1.add(11);


        ll2.add(2);
        ll2.add(4);
        ll2.add(6);
        ll2.add(8);
        ll2.add(10);
        ll2.add(12);

        ll1.display();
        ll2.display();
        ll1.marge(ll1.head, ll2.head);

    }

}
