public class GenericMethods {

    static <T> void printValues(T t1, T t2, T t3) {
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }

    // Nivell 2 - Exercici 1
    static <T> void printValues2(T t1, T t2, Person person) {
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(person.toString());
    }

    // Nivell 2 - Exercici 2
    static <T> void printValues3(T[] array) {
        for(T t: array) {
            System.out.println(t.toString());
        }
    }
}
