import domain.Dog;

import java.util.Scanner;

public class Main {

    private static Scanner scanner;
    private static BinarySearchTree<Dog> doggies;

    /**
     * Link catre documentatie:
     * https://medium.com/@calindotgabriel/7763a46a252a
     */

    public static void main(String[] args) {
        doggies = new BinarySearchTree<Dog>();
        scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter command:\n" +
                    " 'add' : add doggie to hotel \n" +
                    " 'list' : list doggies \n " +
                    " 'search' : search doggie \n" +
                    "type 'exit' if done");
            String cmd = scanner.nextLine();
            if (cmd.equals("exit")) break;
            if (cmd.equals("add")) addDoggie();
            if (cmd.equals("list")) searchDoggie();
            if (cmd.equals("list")) listDoggies();
        }

    }

    public static void addDoggie() {
        System.out.println("Name of doggie: ");
        String name = scanner.nextLine();
        System.out.println("Loyalty: ");
        int loyalty = scanner.nextInt();
        doggies.insert(new Dog(name, loyalty));
        System.out.println("Doggie added sucesfully!");
    }


    private static void searchDoggie() {
        System.out.println("Name of doggie: ");
        String name = scanner.nextLine();
        System.out.println("Loyalty: ");
        int loyalty = scanner.nextInt();
        if (doggies.search(new Dog(name, loyalty)))
            System.out.println("We have this doggie in our hotel!");
        else
            System.out.println("Sorry, doggie not here.");
    }

    private static void listDoggies() {
        for (Dog dog : doggies) {
            System.out.println(dog.getName());
        }
    }
}
