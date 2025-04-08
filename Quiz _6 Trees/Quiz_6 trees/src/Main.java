//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(25);
        tree.insert(20);
        tree.insert(15);
        tree.insert(27);
        tree.insert(30);
        tree.insert(29);
        tree.insert(26);
        tree.insert(22);
        tree.insert(32);

        tree.traverseInOrderDescending();
        //tree.inOrderTraverse();

        int searchValue = 27;
       System.out.println("\n Node " + searchValue + " = "+ tree.get(searchValue));
       System.out.println("\n Node with the greatest value : " +  tree.getMax());
        System.out.println("\n Node with the least value : " +  tree.getMin());

    }
}