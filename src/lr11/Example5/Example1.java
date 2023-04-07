package lr11.Example5;

public class Example1 {
    public static void main(String[] args) {
        Example51 head = new Example51(0, null);
        Example51 tail = head;
        for (int i = 0; i < 10; i++) {
            tail.next = new Example51(i + 1, null);
            tail = tail.next;
        }
        Example51 ref = head;
        System.out.println("Формирование списка c головы: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next;
        }
    }
}

class Example51 {
    public int value;
    public Example51 next;

    Example51(int value, Example51 next) {
        this.value = value;
        this.next = next;
    }
}
