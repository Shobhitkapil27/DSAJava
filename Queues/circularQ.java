public class circularQ {
    cqNode rear=null;
    cqNode front=null;

    public void enque(int data){
        cqNode curr=new cqNode(data);
        if(rear==null){
            curr.next=null;
            rear=front=curr;
        }
        else{
            curr.next=front;
            rear.next=curr;
            rear=curr;
        }
    }

    public void dequeue(){
        if(rear==null) {
            System.out.println("The Queue is Empty!!!");
            return;
        }
        else if(rear==front){
            System.out.println("Element : "+rear.data);
            rear=front=null;
            return;
        }
        System.out.println("Element : "+front.data);
        rear.next=front.next;
        front=front.next;
    }

    public void printQ(){
        if(front==null){
            System.out.println("The Queue is Empty!!");
            return;
        }
        cqNode temp=front;
        while(temp.next!=rear.next){
            System.out.print(temp.data+"<-");
            temp=temp.next;
        }
        System.out.println(rear.data+"<-null");
    }

    public static void main(String[] args) {
        circularQ q=new circularQ();
        q.enque(2);
        q.enque(3);
        q.enque(4);
        q.enque(5);
        q.enque(6);
        q.enque(7);
        q.enque(8);
        q.printQ();
        q.dequeue();
        q.printQ();
    }
}

class cqNode{
    int data;
    cqNode next;

    public cqNode(int data){
        this.data=data;
    }
}
