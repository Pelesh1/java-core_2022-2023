package lr7;

public class Example4 {
    public static void main(String[] args) {
        SuperClass4 superClassTest = new SuperClass4('П');
        String className = superClassTest.toString();
        System.out.println(className);

        SuperClass4 superClassTestCopy = new SuperClass4(superClassTest);
        String classNameCopy = superClassTestCopy.toString();
        System.out.println(classNameCopy);

        PodClass4 SubClassTest = new PodClass4('П',"Привет");
        String className1 = SubClassTest.toString();
        System.out.println(className1);

        PodClass4 SubClassTestCopy = new PodClass4(SubClassTest);
        String className1Copy = SubClassTestCopy.toString();
        System.out.println(className1Copy);

        PodClass4_4 Sub2ClassTest = new PodClass4_4('П',"Привет",100);
        String className2 = Sub2ClassTest.toString();
        System.out.println(className2);

        PodClass4_4 Sub2ClassTestCopy = new PodClass4_4(Sub2ClassTest);
        String className2Copy = Sub2ClassTestCopy.toString();
        System.out.println(className2Copy);
    }
}
/*
Напишите программу, в которой использована цепочка наследования из трех
классов. В первом классе есть открытое символьное поле. Во втором классе появляется
открытое текстовое поле. В третьем классе появляется открытое целочисленное поле. В
каждом из классов должен быть конструктор, позволяющий создавать объект на основе
значений полей, переданных аргументами конструктору, а также конструктор создания
копии.
 */
