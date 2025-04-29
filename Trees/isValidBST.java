//This is program to check weather the tree is valid BST or not.
//We can simply find the inorder traversal returns a sorted list or array or not.
//Instead of storing the data of nodes in the list and checking weather the list is sorted
//we keep stack and check weather the next incoming value is greater than the current top and replace it.
//If we catch any exception we return false else we replace the top with next coming value.
//This is another method of inorder traversal with worse time complexity then the recursive approach.
import java.util.Stack;

public class isValidBST {
    public boolean isValid(bstNode root) {
        if (root==null)
            return true;
        Stack<bstNode> stack = new Stack<>();
        bstNode pre = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            if(pre!= null && root.data<=pre.data)
                return false;
            pre=root;
            root=root.right;
        }
        return true;
    }

    public static void main(String[] args) {
        isValidBST bt=new isValidBST();
        bstNode root=new bstNode(5);
        root.left=new bstNode(3);
        root.right=new bstNode(8);
        root.left.left=new bstNode(1);
        root.left.right=new bstNode(4);
        //root.right.left=new bstNode(100);

        if(bt.isValid(root))
            System.out.println("Binary Search Tree is valid!!");
        else
            System.out.println("Binary Search Tree is not valid!!");
    }
}

