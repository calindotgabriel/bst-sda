package domain;

/**
 * Created by motan on 23.06.2015.
 */
public class Dog implements Comparable<Dog> {

    private String name;
    private int loyalty;

    public Dog(String name, int loyalty) {
        this.name = name;
        this.loyalty = loyalty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    @Override
    public int compareTo(Dog o) {
        return this.getLoyalty() - o.getLoyalty();
    }
}
