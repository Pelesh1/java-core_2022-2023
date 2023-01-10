package lr7;

public class PodClass4 extends SuperClass4 {
    public String str1;
    public void setChar1Str1(char char1, String str1) {
        super.char1 = char1;
        this.str1 = str1;
    }
    PodClass4(char char1, String str1) {
        super(char1);
        this.setChar1Str1(char1, str1);
    }
    PodClass4(PodClass4 copy) {
        super(copy.char1);
        this.setChar1Str1(copy.char1, copy.str1);
    }

    @Override
    public String toString() {
        String PodFieldValue =
                "\n str 1 = " + this.getStr1();
        return super.toString()+PodFieldValue;
    }
    public String getStr1() {
        return str1;
    }
}
