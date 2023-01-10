package lr7;

public class PodClass3_3 extends PodClass3 {
    public String str2;
    public void setInt1Str1Str2(int int1, char char1, String str2) {
        super.int1 = int1;
        super.char1 = char1;
        this.str2 = str2;
    }
    PodClass3_3(int int1, char char1, String str2) {
        super(int1,char1);
        setInt1Str1Str2(int1, char1, str2);
    }

    public String toString() {
        String Pod3FieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString()+Pod3FieldValue;
    }
    public String getStr2() {
        return str2;
    }
}
