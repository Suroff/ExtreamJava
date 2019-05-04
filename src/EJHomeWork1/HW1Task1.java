package EJHomeWork1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Написать метод, который меняет два
 * элемента массива местами (массив может быть любого ссылочного типа);
 */

public class HW1Task1 {

    /**Метод меняет местами два элемента в списке
    *    @param list список
    *    @param elOne индекс элемента один
    *    @param elTwo индекс элемена два
    *     @param <T> тип данных в списке
    *   @throws IndexOutOfBoundsException на тот случай если какой то умник, задаст индексы больше размера списка
    */

    private static <T> void swapHero(List<T> list, final int elOne, final int elTwo) throws IndexOutOfBoundsException{

        T el1 = list.get(elOne);
        T el2 = list.get(elTwo);
        list.set(elOne,el2);
        list.set(elTwo,el1);
    }

    public static void main(String[] args) {
        //Первый список со String
        List<String> avengers = new ArrayList<>(Arrays.asList("Черная вдова", "Железный человек", "Человек паук", "Тор", "Халк", "Капитан Америка"));
        System.out.println(avengers);
        swapHero(avengers,1,5);
        System.out.println(avengers);

        //Второй список с Integer
        List<Integer> chisla = new ArrayList<>(Arrays.asList(11,38,44,69,420));
        System.out.println(chisla);
        swapHero(chisla,0,4);
        System.out.println(chisla);
    }
}
