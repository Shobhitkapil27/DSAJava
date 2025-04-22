public class bsTree {

    static bstNode root=null;

    /*We can perform the same add operation using recursion.
    *Where we call the function add passing the next node as parameter based on weather
    the vale to be added is less or more then the current node.
    *Similar to the traversal functions that we have written.
    * We would require two functions in that case which are depicted below.

    public void add(int data){
    root=insertNode(root,data);
    }

    public bstNode insertNode(bstNode Node,int data) {
        if (Node == null) {
            Node = new bstNode(data);
            return Node;
        } else if (Node.data > data)
            Node.left = insertNode(Node.left, data);
        else
            Node.right = insertNode(Node.right, data);

        return Node;
    }
     */

    public void add(int data){
        bstNode curr=new bstNode(data);
         if(root==null){
             root=curr;
             return;
         }
         bstNode temp=root;
         while(true){
             if(data>=temp.data){
                 if(temp.right!=null)
                     temp=temp.right;
                 else {
                     temp.right = curr;
                     break;
                 }
             }
             else if(data<temp.data){
                 if(temp.left!=null)
                     temp=temp.left;
                 else {
                     temp.left = curr;
                     break;
                 }
             }
         }
    }


    public void inOrderTraversal(bstNode node) {
        if (node != null) {
            inOrderTraversal(node.left);
            System.out.print(node.data + " ");
            inOrderTraversal(node.right);
        }
    }

    public void preOrderTraversal(bstNode node) {
        if (node != null) {
            System.out.print(node.data + " ");
            preOrderTraversal(node.left);
            preOrderTraversal(node.right);
        }
    }

    public void postOrderTraversal(bstNode node) {
        if (node != null) {
            postOrderTraversal(node.left);
            postOrderTraversal(node.right);
            System.out.print(node.data + " ");
        }
    }

    public static void main(String[] args) {
        bsTree bt=new bsTree();
        bt.add(2);
        bt.add(3);
        bt.add(1);
        bt.add(5);
        bt.add(6);
        System.out.print("In-order Traversal : ");
        bt.inOrderTraversal(root);
        System.out.println();
        System.out.print("Post-order Traversal : ");
        bt.postOrderTraversal(root);
        System.out.println();
        System.out.print("Pre-order Traversal : ");
        bt.preOrderTraversal(root);
        System.out.println();
    }
}

class bstNode{
    int data;
    bstNode left;
    bstNode right;

    public bstNode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}