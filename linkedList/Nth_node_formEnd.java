public class Nth_node_formEnd {
    public static class node{
        int data;
        node next;
        node(int data){
            this.data=data;
        }
    }
    public static node nthNode(node head,int idx){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-idx+1;
        temp=head;
        for(int i =1;i<=m-1;i++){
            temp=temp.next;

        }
        return temp;
    }
    public static void main(String []args){
        node a =new node(5);
        node b =new node(25);
        node c =new node(35);
        node d =new node(65);
        node e =new node(55);
        node f =new node(52);
        node g =new node(75);
        node h =new node(59);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        f.next = g;
        g.next = h;
        node get =nthNode(a,3);
        System.out.print(get.data);
    }
}
