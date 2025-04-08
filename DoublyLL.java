public class DoublyLL {
    DoublyNode head=null;
    DoublyNode tail=null;

    public void addNode(int data){
        DoublyNode curr=new DoublyNode(data);
        if(head==null){
            head=curr;
            tail=curr;
            head.next=tail.next=null;
            head.prev=tail.prev=null;
        }
        else{
            head.next=curr;
            curr.next=null;
            curr.prev=head;
            head=curr;
        }
    }

    public void displayForward(){
       DoublyNode temp=tail;
       if(temp==null) {
           System.out.println("The list is Empty!!");
           return;
       }
        System.out.print("null->");
           while(temp!=null){
               System.out.print(temp.data+"<->");
               temp=temp.next;
           }
           System.out.println("null");
    }

    public void displayReverse(){
        DoublyNode temp=head;
        if(temp==null){
            System.out.println("The List is empty!!");
            return;
        }
        System.out.print("null->");
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.prev;
        }
        System.out.println("null");
    }

    //We remove the first occurence of data instead of removing all of the nodes by value
    public void DeleteNodeByData(int data){
        if(tail.data==data){ //To handle the deleteion of tail or first node
            tail=tail.next;
            return;
        }

        DoublyNode temp=tail;

        while(temp!=null) {
            if(temp.next.data==data) {
                temp.next=temp.next.next;
                if(temp.next!=null)
                temp.next.next.prev = temp.next.prev;
                System.out.println("Node Deleted Successfully!!");
                return;
            }
            temp=temp.next;
        }
        System.out.println("No node found with that data!!");
    }

    public static void main(String[] args) {
        DoublyLL d=new DoublyLL();
        d.addNode(2);
        d.addNode(3);
        d.addNode(4);
        d.addNode(5);
        d.addNode(6);
        d.addNode(7);
        d.addNode(9);
        d.displayForward();
        d.displayReverse();
        d.DeleteNodeByData(2);
        d.displayForward();
    }
}

class DoublyNode{
    int data;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(int data){
        this.data=data;
    }
}
