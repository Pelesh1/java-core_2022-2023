package lr7;

public class SuperClass3 {
    public int int1;
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    SuperClass3(int int1){
        this.setInt1(int1);
    }
    public String toString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                        " int 1 = " + this.getInt1();
        return ClassNameAndFieldValue;
    }
    public int getInt1() {
        return int1;
    }
}
