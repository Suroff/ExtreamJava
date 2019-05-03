package EJHomeWork1;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать метод, который преобразует массив в ArrayList;
 */

public class HW1Task2 {

    /**
     * Метод преобразует массив в ArrayList.
     * @param array массив источник
     * @param <T> тип данных
     * @return ArrayList результат
     */

    static <T> List<T> convertToArrayList(final T[] array){
        final List<T> l = new ArrayList<T>(array.length);

        for (final T s:array){
            l.add(s);
        }
        return (l);
    }


    public static void main(String[] args) {
        //Преобразование массива с Integer
        Integer[] ints = new Integer[]{
                1,2,3,4,5,6,7,8,9,0
        };

        List<Integer> integers = convertToArrayList(ints);
        System.out.println(integers);
        //Преобразование массива с String

        String[] strs = new String[]{
                "moonday","toosday","wendsday","thorday","fryday","sutaday","sonday"
        };
        List<String> strings = convertToArrayList(strs);
        System.out.println(strings);
    }
}
