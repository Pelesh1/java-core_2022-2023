package lr7;

public class PodClass4_4 extends PodClass4 {
    public int int1;
    public void setChar1Str1Int1(char char1, String str1, int int1) {
        super.char1 = char1;
        super.str1 = str1;
        this.int1 = int1;
    }
    PodClass4_4(char char1, String str1, int int1) {
        super(char1,str1);
        setChar1Str1Int1(super.char1, super.str1, int1);
    }
    PodClass4_4(PodClass4_4 copy) {
        super(copy.char1, copy.str1);
        this.setChar1Str1Int1(copy.char1, copy.str1, copy.int1);
    }

    public String toString() {
        String Pod2FieldValue =
                "\n str 2 = " + this.getInt1();
        return super.toString()+Pod2FieldValue;
    }
    public int getInt1() {
        return int1;
    }
}
