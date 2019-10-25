public class Node<T> {

    public Comparable data;
    public Node<T> left;
    public Node<T> right;

    public Node(Comparable data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
