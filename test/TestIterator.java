import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by motan on 23.06.2015.
 */
public class TestIterator extends TestCase {

    public void testIterator() {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();
        bst.insert(7);
        bst.insert(9);
        bst.insert(21);
        Iterator<Integer> iterator = bst.iterator();
        assertTrue(iterator.hasNext());
        assertNotNull(iterator.next());

    }
}
