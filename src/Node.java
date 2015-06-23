/**
 * Created by motan on 23.06.2015.
 */
public class Node<T> {

    public T data;
    public Node<T> left, right;

    public Node(T data, Node<T> left, Node<T> right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(T data) {
        this.data = data;
    }



    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
