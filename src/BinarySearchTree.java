import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by motan on 23.06.2015.
 */
public class BinarySearchTree<T extends Comparable<T>> implements Iterable<T>{

    private Node<T> root;
    private Comparator<T> comparator;

    public BinarySearchTree() {
    }

    public BinarySearchTree(Node<T> root) {
        this.root = root;
    }

    public BinarySearchTree(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    public BinarySearchTree(Node<T> root, Comparator<T> comparator) {
        this.root = root;
        this.comparator = comparator;
    }

    public void setComparator(Comparator<T> comparator) {
        this.comparator = comparator;
    }

    /**
     * Compares two elements, if no specified comparator, falls back to element's compareTo method.
     */
    private int compare(T x, T y) {
        return comparator == null ? x.compareTo(y) : comparator.compare(x, y);
    }

    public void insert(T data) {
        root = insert(root, data);
    }

    private Node<T> insert(Node<T> p, T dataToInsert) {
        if (p == null) {
            return new Node<T>(dataToInsert);
        }
        if (compare(dataToInsert, p.data) == 0) {
            return p;
        }
        if (compare(dataToInsert, p.data) < 0) {
            p.left = insert(p.left, dataToInsert);
        } else {
            p.right = insert(p.right, dataToInsert);
        }
        return p;
    }


    public boolean search(T toSearch)
    {
        return search(root, toSearch);
    }
    private boolean search(Node<T> p, T toSearch)
    {
        if (p == null)
            return false;
        else
        if (compare(toSearch, p.data) == 0)
            return true;
        else
        if (compare(toSearch, p.data) < 0)
            return search(p.left, toSearch);
        else
            return search(p.right, toSearch);
    }

    public void delete(T toDelete)
    {
        root = delete(root, toDelete);
    }
    private Node<T> delete(Node<T> p, T toDelete)
    {
        if (p == null)  throw new RuntimeException("cannot delete.");
        else
        if (compare(toDelete, p.data) < 0)
            p.left = delete (p.left, toDelete);
        else
        if (compare(toDelete, p.data)  > 0)
            p.right = delete (p.right, toDelete);
        else
        {
            if (p.left == null) return p.right;
            else
            if (p.right == null) return p.left;
            else
            {
                // get data from the rightmost node in the left subtree
                p.data = retrieveData(p.left);
                // delete the rightmost node in the left subtree
                p.left =  delete(p.left, p.data) ;
            }
        }
        return p;
    }
    private T retrieveData(Node<T> p)
    {
        while (p.right != null) p = p.right;

        return p.data;
    }

    public int height()
    {
        return height(root);
    }
    private int height(Node<T> p)
    {
        if(p == null) return -1;
        else
            return 1 + Math.max( height(p.left), height(p.right));
    }

    @Override
    public Iterator<T> iterator() {
        return new BstIterator<T>(root);
    }
}
