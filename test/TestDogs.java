import domain.Dog;
import junit.framework.TestCase;

import java.util.Iterator;

/**
 * Created by motan on 23.06.2015.
 */
public class TestDogs extends TestCase{


    public void testDoggie() {
        Dog loyalDog = new Dog("scrabbles", 10);
        Dog notSoLoyalDog = new Dog("mogly", 9);
        assertTrue(loyalDog.compareTo(notSoLoyalDog) > 0);

    }

    public void testDoggieFactory(){
        BinarySearchTree<Dog> dogs = new BinarySearchTree<Dog>();
        Dog scrabbles = new Dog("scrabbles", 10);
        Dog mogly = new Dog("mogly", 9);
        dogs.insert(scrabbles);
        dogs.insert(mogly);

        assertTrue(dogs.search(scrabbles));

        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
