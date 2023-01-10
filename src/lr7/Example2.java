package lr7;

public class Example2 {
    public static void main(String[] args) {
        SuperClass2 Test0 = new SuperClass2();
        String superClassTest0 = Test0.toString();
        System.out.println(superClassTest0);

        SuperClass2 Test1 = new SuperClass2("Проверить");
        String superClassTest1 = Test1.toString();
        System.out.println(superClassTest1);

        SuperClass2 Test2 = new PodClass2();
        String subClassTest0 = Test2.toString();
        System.out.println(subClassTest0);

        SuperClass2 Test3 = new PodClass2("Это проверить");
        String subClassTest1 = Test3.toString();
        System.out.println(subClassTest1);

        SuperClass2 Test4 = new PodClass2(512);
        String subClassTest2 = Test4.toString();
        System.out.println(subClassTest2);

        SuperClass2 Test5 = new PodClass2("И это не забыть", 512);
        String subClassTest3 = Test5.toString();
        System.out.println(subClassTest3);
    }
}
/*
Напишите программу, в которой есть суперкласс с приватным текстовым полем. В
базовом классе должен быть метод для присваивания значения полю: без параметров и с
одним текстовым параметром. Объект суперкласса создается передачей одного текстового
аргумента конструктору. Доступное только для чтения свойство результатом возвращает
длину текстовой строки. На основе суперкласса создается подкласс. В подклассе появляется
дополнительное открытое целочисленное поле. В классе должны быть такие версии метода
для присваивания значений полям (используется переопределение и перегрузка метода из
суперкласса): без параметров, с текстовым параметром, с целочисленным параметром, с
текстовым и целочисленным параметром. У конструктора подкласса два параметра
(целочисленный и текстовый).
 */
