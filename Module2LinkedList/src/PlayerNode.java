public class PlayerNode {
    private Player player;
    private PlayerNode nextPlayerNode;
    PlayerNode next;

    public PlayerNode(Player player) {
        this.player = player;
        this.next = null;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNextPlayerNode() {
        return nextPlayerNode;
    }

    public void setNextPlayerNode(PlayerNode nextPlayerNode) {
        this.nextPlayerNode = nextPlayerNode;
    }

}
