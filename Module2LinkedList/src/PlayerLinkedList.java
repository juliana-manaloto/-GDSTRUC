

public class PlayerLinkedList {
    public Object size;
    private PlayerNode head;

    public void addToFront(Player player) {
        PlayerNode newNode = new PlayerNode(player);
        newNode.setNextPlayerNode(head);
        head = newNode;
    }

    public void printLinkedList() {
        System.out.print("[HEAD] -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
        }

        System.out.print("NULL");
    }

    void deleteHead() {
        if (head != null) {
            PlayerNode toDelete = head;
            head = head.next;

        }

    }


    public void printLinkedListSize() {
        System.out.print("[HEAD] -> ");
        PlayerNode current = head;
        int size = 0;
        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayerNode();
            size++;

        }
        System.out.print("NULL");
        System.out.println("\n Size of list: " + size);
    }


}






