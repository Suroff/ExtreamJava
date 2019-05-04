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
    *    @param elone индекс элемента один
    *    @param eltwo индекс элемена два
    *     @param <T> тип данных в списке
    *   @throws IndexOutOfBoundsException на тот случай если какой то умник, задаст индексы больше размера списка
    */

    private static <T> void swapHero(List<T> list, final int elone, final int eltwo) throws IndexOutOfBoundsException{
        //Для нормального человека счет элементов начинается с 1, а не с 0
        //Поэтому добавил вычитание 1
        T el1 = list.get(elone - 1);
        T el2 = list.get(eltwo - 1);
        list.set(elone - 1,el2);
        list.set(eltwo - 1,el1);
    }

    public static void main(String[] args) {
        //Первый список со String
        List<String> avengers = new ArrayList<>(Arrays.asList("Черная вдова", "Железный человек", "Человек паук", "Тор", "Халк", "Капитан Америка"));
        System.out.println(avengers);
        swapHero(avengers,2,6);
        System.out.println(avengers);

        //Второй список с Integer
        List<Integer> chisla = new ArrayList<>(Arrays.asList(11,38,44,69,420));
        System.out.println(chisla);
        swapHero(chisla,1,5);
        System.out.println(chisla);
    }
}
