import junit.framework.TestCase;

/**
 * Created by motan on 23.06.2015.
 */
public class TestBst extends TestCase {

    public void testInsert() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();

        tree.insert(7);
        assertEquals(0, tree.height());

        tree.insert(8);
        assertEquals(1, tree.height());
    }

    public void testSearch() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(20);
        assertTrue(tree.search(20));
    }

    public void testDelete() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<Integer>();
        tree.insert(3);
        tree.delete(3);
        assertFalse(tree.search(3));
    }


}
