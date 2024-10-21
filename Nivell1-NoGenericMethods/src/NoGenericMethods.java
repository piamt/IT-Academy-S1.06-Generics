public class NoGenericMethods {

    Integer t1;
    Integer t2;
    Integer t3;

    public NoGenericMethods(Integer t1, Integer t2, Integer t3) {
        this.t1 = t1;
        this.t2 = t2;
        this.t3 = t3;
    }

    public Integer getT1() {
        return this.t1;
    }

    public void setT1(Integer t1) {
        this.t1 = t1;
    }

    public Integer getT2() {
        return this.t2;
    }

    public void setT2(Integer t2) {
        this.t2 = t2;
    }

    public Integer getT3() {
        return this.t3;
    }

    public void setT3(Integer t3) {
        this.t3 = t3;
    }

    @Override
    public String toString() {
        return "NoGenericMethods: t1=" + t1 + " t2=" + t2 + " t3=" + t3;
    }
}
