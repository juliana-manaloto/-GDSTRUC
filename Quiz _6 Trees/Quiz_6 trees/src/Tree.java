public class Tree {
    private Node root;

    public void insert(int value) {
        if (root == null) {
            root = new Node(value);
            return;
        }

        root.insert(value);
    }

    public void traverseInOrderDescending(){
        if(root == null){
            System.out.println("Tree is empty :(");
            return;
        }
        root.traverseInOrderDescending();

    }
    public void inOrderTraverse(){
        if(root == null){
            System.out.println("Tree is empty :(");
            return;
        }
        root.inOrderTraverse();

    }
}
