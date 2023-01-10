package lr7;

public class SuperClass2 {
    private String str1;
    SuperClass2() {setStr1();}
    SuperClass2(String str1){setStr1(str1);}
    public void setStr1 () {
        this.str1 = "пустота";
    }
    public void setStr1 (String str1){
        this.str1 = str1;
    }
    public String getStr1(){
        return str1;
    }
    public int getStr1length(){
        return str1.length();
    }
    @Override
    public String toString() {
        String superClassNameAndFieldValue = "SuperClass2{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}
