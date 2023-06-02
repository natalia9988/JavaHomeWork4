package HW4;

import java.util.Arrays;
import java.util.LinkedList;

//Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println("Дан список элементов: " + list);
        System.out.println("Перевернутый список: " + reverse(list));
    }

    public static LinkedList<Integer> reverse(LinkedList<Integer> list) {
        LinkedList<Integer> revList = new LinkedList<>();
        for(int i=list.size()-1;i>=0;i--){
            revList.add(list.get(i));
        }
        return revList;


    }

}
