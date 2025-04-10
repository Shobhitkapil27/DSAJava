public class QueueImplement {
   qNode top=null;
   qNode tail=null;

   public void push(int data){
       qNode curr=new qNode(data);
       if(top==null){
           curr.next=null;
           top=tail=curr;
       }
       else{
           top.next=curr;
           top=curr;
       }
   }

   public void peep(){
       if(top==null) {
           System.out.println("The Queue is Empty!!!");
           return;
       }
       System.out.println("Element : "+tail.data);
           tail=tail.next;
   }

   public void printQ(){
       if(tail==null){
           System.out.println("The Queue is Empty!!");
           return;
       }
       qNode temp=tail;
       while(temp!=null){
           System.out.print(temp.data+"->");
           temp=temp.next;
       }
       System.out.println("null");
   }

    public static void main(String[] args) {
        QueueImplement q=new QueueImplement();
        q.push(2);
        q.push(3);
        q.push(4);
        q.push(5);
        q.push(6);
        q.push(7);
        q.printQ();
        q.peep();
        q.printQ();
    }
}

class qNode{
    int data;
    qNode next;

    public qNode(int data){
        this.data=data;
    }
}
