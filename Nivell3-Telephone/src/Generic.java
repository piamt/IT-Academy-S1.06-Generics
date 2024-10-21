class Generic {

    static <T extends Telephone> void genericMethod1(T t) {
        t.call();
    }

    static <T extends Smartphone> void genericMethod2(T t) {
        t.call();
        t.takePicture();
    }
}