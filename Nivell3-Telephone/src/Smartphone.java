public class Smartphone implements Telephone {

    @Override
    public void call() {
        System.out.println("Smartphone calling");
    }

    public void takePicture() {
        System.out.println("Smartphone taking picture");
    }
}
