public class StackImplement {
    StackNode top=null;

    public void push(int data){
        StackNode temp=new StackNode(data);
        if(temp==null)
            top=temp;
        else{
            temp.next=top;
            top=temp;
        }
    }

    public void pop(){
        if(top==null){
            System.out.println("The stack is empty!!");
            return;
        }
        System.out.println("Top Element: "+top.data);
        top=top.next;
    }

    public boolean isEmpty(){
        if(top==null)
            return true;
        else
            return false;
    }

    public void printStack(){
        StackNode temp=top;
        if(temp==null){
            System.out.println("The stack is Empty!!");
            return;
        }
         while(temp!=null){
             System.out.print(temp.data+"->");
             temp=temp.next;
         }
        System.out.println("null");
    }

    public static void main(String[] args) {
        StackImplement st=new StackImplement();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.printStack();
        st.pop();
        st.pop();
        st.printStack();
    }
}


class StackNode{
    int data;
    StackNode next;
    public StackNode(int data){
        this.data=data;
    }
}