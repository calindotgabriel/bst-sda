package domain;

import java.util.Comparator;

/**
 * Created by motan on 23.06.2015.
 */
public class DogComparator implements Comparator<Dog> {

    @Override
    public int compare(Dog o1, Dog o2) {
        return o1.getLoyalty() - o2.getLoyalty();
    }

}
