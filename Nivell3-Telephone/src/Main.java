public class Main {
    public static void main(String[] args) {

        System.out.println("Generic telephone:");
        Generic.genericMethod1(new Smartphone());


        System.out.println("\nGeneric Smartphone:");
        Generic.genericMethod2(new Smartphone());
    }
}