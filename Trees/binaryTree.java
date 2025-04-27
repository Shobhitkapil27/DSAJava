class binaryTree {
    btNode root;

    // Traverse tree
    public void addNode(btNode btNode) {
        if (btNode != null) {
            addNode(btNode.left);
            System.out.print(" " + btNode.data);
            addNode(btNode.right);
        }
    }

    public static void main(String[] args) {

        // create an object of binaryTree
        binaryTree tree = new binaryTree();

        // create btNodes of the tree
        tree.root = new btNode(3);
        tree.root.left = new btNode(11);
        tree.root.right = new btNode(2);
        tree.root.left.left = new btNode(5);
        tree.root.left.left.left = new btNode(13);

        System.out.print("\nbinary Tree: ");
        tree.addNode(tree.root);
    }
}

// class to create btbtNodes
class btNode {
    int data;
    btNode left, right;

    public btNode(int data) {
        this.data = data;
        left = right = null;
    }
}
