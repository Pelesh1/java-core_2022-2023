package lr11.Example5;

public class Example2 {
    public static void main(String[] args) {
        Example5V head = null;
        for (int i = 10; i >= 0; i--)
        {
            head = new Example5V(i, head);
        }
        Example5V ref = head;
        System.out.print("Формирование  списка с хвоста: ");
        while (ref != null) {
            System.out.print(" " + ref.value);
            ref = ref.next; }
    }
}

class Example5V {
    public int value; public Example5V next;
    Example5V(int value, Example5V next)
    {
        this.value = value; this.next = next;
    }
}
