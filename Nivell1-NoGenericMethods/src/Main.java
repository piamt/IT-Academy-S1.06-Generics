public class Main {
    public static void main(String[] args) {
        NoGenericMethods<Integer> integerNoGenericMethods = new NoGenericMethods<>(1, 2, 3);
        System.out.println(integerNoGenericMethods);

        NoGenericMethods<Integer> integerNoGenericMethods2 = new NoGenericMethods<>(3, 1, 2);
        System.out.println(integerNoGenericMethods2);
    }
}