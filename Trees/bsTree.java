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

    //Method for searching a key in bst using recursion
    public void search(bstNode node,int key){
        if(node==null){
            System.out.println("Key not found!!");
            return;
        }
        else if(node.data==key){
            System.out.println("Key Found!!");
            return;
        }
        else{
            if(key>node.data)
                search(node.right,key);
            else
                search(node.left,key);
        }
    }

    //Method for finding height of the tree
    public int height(bstNode node){
         if(node==null)
             return -1;

         int maxright=height(node.right);
         int maxleft=height(node.left);

         return Math.max(maxleft,maxright)+1;
    }

    //Method for finding maximum width of a tree
    public int maxWidth(bstNode node){
         int level=height(node);
         int maxWidth=0;
         int width=0;

         for(int i=1;i<=level;i++){
             width=getWidth(node,i);
             if(width>maxWidth)
                 maxWidth=width;
         }
         return maxWidth;
    }

    public int getWidth(bstNode node, int level){
        if(node==null)
             return 0;
        if(level==1)
            return 1;
        else if(level>1)
            return (getWidth(node.left,level-1)+getWidth(node.right,level-1));

        return 0;
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
        bt.search(root,10);
        System.out.println("Maximum Width of Tree : "+bt.maxWidth(root));
        System.out.println("Maximum Height of Tree : "+bt.height(root));

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
