public class LinkedList {
    static Node head = null;

    public static void addNode(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            head.next = null;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = n;
        }
    }

    public static void deleteNode(int data){

        if(head.data==data)
            head=head.next;//Case to handle deletion of first node

        Node temp=head;
        if(temp==null){
            System.out.println("List is empty!!");
            return;
        }
        while(temp!=null){
            if(temp.next!=null&&temp.next.data==data){
                temp.next=temp.next.next;
                System.out.println("Data deleted successfully!!");
            }
            temp=temp.next;
        }
    }

    public static void displayList() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty");
        } else {
            while (temp != null) {
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String[] args) {
        addNode(2);
        addNode(3);
        addNode(4);
        addNode(5);
        addNode(6);
        addNode(7);
        displayList();
        deleteNode(2);
        displayList();
    }
}


class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
    }
}