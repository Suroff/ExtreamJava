package EJLesson1;

import EJLesson1.ссс.ChildOfChildOfRoot;
import EJLesson1.ссс.ChildOfRoot;
import EJLesson1.ссс.Root;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static <T> T printType(T val){
        System.out.println(val.getClass().getName());
        return val;
    }

    public static void main(String[] args) {
        Container c1 = new Container("Boobs");
        Container c2 = new Container("String");
        Container c3 = new Container(0.5);
        Container c4 = new Container(new Object());


        if (c1.getObj() instanceof Integer){
        int val = (Integer) c1.getObj();
        System.out.println(val);}
        else {
            System.out.println("Not integer");
        }

        if (c2.getObj() instanceof String){
        String str = (String) c2.getObj();
        System.out.println(str);}
        else {
            System.out.println("Not string");
        }

        if (c3.getObj() instanceof Double){
        Double dbl = (Double) c3.getObj();
        System.out.println(dbl);}
        else {
            System.out.println("Not Double");
        }

        if (c4.getObj()instanceof Object){
        Object obj = (Object) c4.getObj();
        System.out.println(obj);}
        else {
            System.out.println("Not object");
        }

        ContainerGeneric<String> strCont = new ContainerGeneric<>("String");
        System.out.println(strCont.getObj());

        ContainerGeneric<Integer> intCont = new ContainerGeneric<>(10);
        System.out.println(intCont.getObj());

        ContainerGeneric<Object> objCont = new ContainerGeneric<>(new Object());
        System.out.println(objCont.getObj());

        Pair<String,Integer> strIntPair = new Pair<>("Ten", 10);
        System.out.println(strIntPair.getKey() + " " + strIntPair.getValue());

        Stat<Integer> intStat = new Stat<>(10,10,10,10);
        System.out.println(intStat.avg());

        printType(new Object());
        printType(10);
        printType("String");

        Stat<Integer> intStat2 = new Stat<>(10,14,15,66);
        Stat<Double> doubStat = new Stat<>(1.0,7.2,11.8,12.8);

        intStat.sameAvg(intStat2);
        intStat.sameAvg(doubStat);
//PECS - Producer Extends Consumer Super
        //не использовать в ДЗ

//использовать то что уже добавлено в массив, добавлять нельзя
        List<? extends ChildOfRoot> extChildOfRoot = new ArrayList<>();
        extChildOfRoot = Arrays.asList(new ChildOfRoot(),new ChildOfChildOfRoot());
//можно толкьо добавлять, использовать то что в нем нельзя
        List<? super ChildOfRoot> superChildOfRoot = new ArrayList<>();

        //extChildOfRoot.add(new ChildOfRoot());
        //extChildOfRoot.add(new ChildOfChildOfRoot());
        //extChildOfRoot.add(new Root());

        extChildOfRoot.add(null);

        superChildOfRoot.add(new ChildOfRoot());
        superChildOfRoot.add(new ChildOfChildOfRoot());
//        superChildOfRoot.add(new Root());

    }
}
