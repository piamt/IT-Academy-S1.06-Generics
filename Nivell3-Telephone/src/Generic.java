public class Generic {

    public static <T extends Telephone> void genericMethod1(T t) {
        t.call();
        //t.takePicture(); // This method cannot be called from here because it is limited by Telephone interface
    }

    public static <T extends Smartphone> void genericMethod2(T t) {
        t.call();
        t.takePicture();
    }
}