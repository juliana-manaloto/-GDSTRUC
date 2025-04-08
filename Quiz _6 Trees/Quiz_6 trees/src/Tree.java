public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }

    public void traverseInOrderDescending() {
        if (root == null) {
            System.out.println("Tree is empty :(");
            return;
        }
        root.traverseInOrderDescending();

    }

    public void inOrderTraverse() {
        if (root == null) {
            System.out.println("Tree is empty :(");
            return;
        }
        root.inOrderTraverse();

    }

    public Node get(int value) {
        if (root == null) {

            return null;
        }

        return root.get(value);
    }
public Node getMax(){
    if (root == null) {

        return null;
    }
    Node current = this.root;
    while(current.getRightChild() != null){
        current = current.getRightChild();
    }
    return current;
}

    public Node getMin(){
        if (root == null) {

            return null;
        }
        Node current = this.root;
        while(current.getLeftChild() != null){
            current = current.getLeftChild();
        }
        return current;
    }
}
