public class Main {
    public static void main(String[] args) {

        // Nivell 1 - Exercici 1
        GenericMethods.printValues(1, 2, 3);
        GenericMethods.printValues("Alex", "Pablo", "Jordi");
        GenericMethods.printValues(
                new Person("Pia", "Muñoz", 35),
                new Person("Pablo", "Lopez", 40),
                new Person("Antonio", "Roca", 23));

        // Nivell 2 - Exercici 1
        Person person = new Person("Pia", "Muñoz", 35);
        GenericMethods.printValues2(1, 2, person);
        GenericMethods.printValues2("Alex", "Pablo", person);

        // Nivell 2 - Exercici 2
        Integer[] integerArray = {4, 5, 6};
        GenericMethods.printValues3(integerArray);

        Person[] personArray = {
                new Person("Pia", "Muñoz", 35),
                new Person("Pablo", "Lopez", 40),
                new Person("Antonio", "Roca", 23)
        };
        GenericMethods.printValues3(personArray);
    }
}