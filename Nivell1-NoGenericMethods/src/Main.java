public class Main {
    public static void main(String[] args) {
        NoGenericMethods integerNoGenericMethods = new NoGenericMethods(1, 2, 3);
        System.out.println(integerNoGenericMethods);

        NoGenericMethods integerNoGenericMethods2 = new NoGenericMethods(3, 1, 2);
        System.out.println(integerNoGenericMethods2);
    }
}