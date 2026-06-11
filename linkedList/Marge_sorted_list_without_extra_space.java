public class Marge_sorted_list_without_extra_space {
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
            node temp =new node(data);
            if(head==null){
                head=temp;
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
        void marge(node head1,node head2){
            node temp1=head1;
            node temp2=head2;
            node h=new node(-1);
            node dupli=h;
            while(temp1!=null && temp2!=null){
                if(temp1.data<temp2.data){
                    dupli.next=temp1;
                    dupli=temp1;
                    temp1=temp1.next;
                }
                else {
                    dupli.next=temp2;
                    dupli=temp2;
                    temp2=temp2.next;
                }
            }
            if(temp1==null) dupli.next=temp2;
            else dupli.next=temp1;

            node tempo = h.next;
            while(tempo != null){
                System.out.print(tempo.data + " ");
                tempo = tempo.next;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
            linkedlist ll1= new linkedlist();
            linkedlist ll2= new linkedlist();
        ll1.add(1);
        ll1.add(4);
        ll1.add(8);
        ll1.add(15);
        ll1.add(20);
        ll1.add(25);

        ll2.add(2);
        ll2.add(3);
        ll2.add(10);
        ll2.add(12);
        ll2.add(18);
        ll2.add(30);

        ll1.display();
        ll2.display();
        ll1.marge(ll1.head, ll2.head);

    }
}
