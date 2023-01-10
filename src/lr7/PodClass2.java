package lr7;

public class PodClass2 extends SuperClass2 {
    private String str2;
    public int int1;
    PodClass2() {setStr1();}
    PodClass2(String str2) {setStr1(str2);}
    PodClass2(int int1) {setStr1(); this.setInt1(int1);}
    PodClass2(String str2, int int1) {setStr1(str2); this.setInt1(int1);}

    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1 (){
        this.str2 = "и тут пустота";
    }
    public void setStr1 (String str2){
        this.str2 = str2;
    }

    public int getInt1(){
        return int1;
    }
    public String getStr1(){
        return str2;
    }
    public int getStr1length(){
        return str2.length();
    }
    @Override
    public String toString() {
        String ClassNameAndFieldValue = "PodClass2{" + "str2=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}"
                +"\nPodClass2{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }
}
