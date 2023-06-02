package HW4;
//Реализуйте очередь с помощью LinkedList со следующими методами:
//        enqueue() - помещает элемент в конец очереди,
//        dequeue() - возвращает первый элемент из очереди и удаляет его,
//        first() - возвращает первый элемент из очереди, не удаляя.
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Дан список элементов: " + list);
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввод элемента:");
        enqueue(list, sc.nextInt());
        System.out.println("enqueue - помещает элемент в конец очереди: " + list);
        System.out.println(("Первый элемент списка: " + dequeue(list)));
        System.out.println("dequeue - возвращает первый элемент из очереди и удаляет его: " + list);
        System.out.println(("Первый элемент списка: " + first(list)));
        System.out.println("first - возвращает первый элемент из очереди, не удаляя: " + list);
        sc.close();
    }
    public static void enqueue(LinkedList<Integer> list, int element){
        list.add(element);
    }
    public static int dequeue(LinkedList<Integer> list){
        int a = list.getFirst();
        list.removeFirst();
        return a;

    }
    public static int first(LinkedList<Integer> list){
        return list.getFirst();
    }
}
