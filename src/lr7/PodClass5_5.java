package lr7;

public class PodClass5_5 extends SuperClass5 {
    protected char char1;
    public void setChar1(char char1) {
        this.char1 = char1;
    }
    PodClass5_5(String str1, char char1) {
        super(str1);
        this.setChar1(char1);
    }
    @Override
    public void PrintToString() {
        String Pod1FieldValue =
                " char1 = \"" + this.getChar1()+"\"";
        super.PrintToString();
        System.out.println(Pod1FieldValue);
    }
    public char getChar1() {
        return char1;
    }
}
