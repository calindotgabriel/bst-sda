import java.util.Iterator;
import java.util.Stack;

/**
 * Created by motan on 23.06.2015.
 */
public class BstIterator<T> implements Iterator<T> {

    Stack<Node<T>> stk = new Stack<Node<T>>();

    public BstIterator(Node<T> root) {
        stk.push(root);
    }

    @Override
    public boolean hasNext() {
        return !stk.isEmpty();
    }

    @Override
    public T next() {
        Node<T> cur = stk.peek();
        if(cur.left != null) {
            stk.push(cur.left);
        }
        else {
            Node<T> tmp = stk.pop();
            while( tmp.right == null ) {
                if(stk.isEmpty()) return cur.data;
                tmp = stk.pop();
            }
            stk.push(tmp.right);
        }
        return cur.data;
    }
}
