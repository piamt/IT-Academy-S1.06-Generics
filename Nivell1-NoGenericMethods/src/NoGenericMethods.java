public class NoGenericMethods<T> {

    T t1;
    T t2;
    T t3;

    public NoGenericMethods(T t1, T t2, T t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public T getT1() {
        return this.t1;
    }

    public void setT1(T t1) {
        this.t1 = t1;
    }

    public T getT2() {
        return this.t2;
    }

    public void setT2(T t2) {
        this.t2 = t2;
    }

    public T getT3() {
        return this.t3;
    }

    public void setT3(T t3) {
        this.t3 = t3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods: t1=" + t1 + " t2=" + t2 + " t3=" + t3;
    }
}
