import java.util.ArrayList;
import java.util.List;

public class GenericMethods {

    static <T, Q, R> void printValues(T t1, Q t2, R t3) {
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());
    }

    static <T, Q> void printValues2(T t1, Q t2, Person person) {
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(person.toString());
    }
    @SafeVarargs
    static<T> void printValues3(List... topics)
    {
        for (List<T> topic : topics) {
            System.out.println(topic);
        }
    }

    @SafeVarargs
    static <T> void printValues4(T... args) {
        for(T arg: args) {
            System.out.println(arg.toString());
        }
    }
}
