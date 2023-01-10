package lr7;

public class PodClass3 extends SuperClass3 {
    public char char1;
    public void setInt1Str1(int int1, char char1) {
        super.int1 = int1;
        this.char1 = char1;
    }
    PodClass3(int int1, char char1) {
        super(int1);
        this.setInt1Str1(int1, char1);
    }

    public String toString() {
        String Pod2FieldValue =
                "\n str 1 = " + this.getChar1();
        return super.toString()+Pod2FieldValue;
    }
    public char getChar1() {
        return char1;
    }
}
