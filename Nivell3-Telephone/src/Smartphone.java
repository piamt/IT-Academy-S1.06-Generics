class Smartphone implements Telephone {

    @Override
    public void call() {
        System.out.println("Smartphone calling");
    }

    protected void takePicture() {
        System.out.println("Smartphone taking picture");
    }
}
