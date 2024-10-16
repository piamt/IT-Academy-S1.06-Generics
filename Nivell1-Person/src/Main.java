import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        System.out.println("Nivell 1 - Exercici 2");
        GenericMethods.printValues(
                new Person("Pia", "Muñoz", 35),
                1,
                "Alex");

        System.out.println("\nNivell 2 - Exercici 1");
        Person person = new Person("Pia", "Muñoz", 35);
        GenericMethods.printValues2(1, "Alex", person);

        System.out.println("\nNivell 2 - Exercici 2");
        Integer[] integerArray = {4, 5, 6};

        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("wolrd");
        list.add("!");
        GenericMethods.printValues3(list);

        GenericMethods.printValues4(person, "Hi!", 2);
    }
}