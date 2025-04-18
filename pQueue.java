public class pQueue {
    pNode head=null;
    public void enQueue(int data, int priority){
        pNode curr=new pNode(data,priority);
        if(head==null){
            head=curr;
            return;
        }

        if(head.priority<priority){
            curr.next=head;
            head=curr;
            return;
        }

        pNode temp=head;
        while(temp.next!=null && temp.next.priority>priority)
            temp = temp.next;

            curr.next = temp.next;
            temp.next = curr;

    }
    public void deQueue(){
        if(head==null){
            System.out.println("The queue is empty!!");
            return;
        }

        if(head.next!=null){
            System.out.println("Element : "+head.data);
            head=head.next;
        }
        else{
            System.out.println("Element : "+head.data);
            head=null;
        }
    }
    public void printQ(){
        if(head==null){
            System.out.println("The queue is empty!!");
            return;
        }
        pNode temp=head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        pQueue pq=new pQueue();
        pq.enQueue(5,21);
        pq.enQueue(11,10);
        pq.enQueue(34,9);
        pq.enQueue(100,1);
        pq.enQueue(55,7);
        pq.printQ();
        pq.deQueue();
        pq.printQ();
        pq.deQueue();
    }
}

class pNode{
    int data;
    int priority;
    pNode next;

    public pNode(int data, int priority){
        this.data=data;
        this.priority=priority;
        this.next=null;
    }
}