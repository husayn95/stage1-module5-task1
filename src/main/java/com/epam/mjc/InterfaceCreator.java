package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class InterfaceCreator {

    //Implement the program which return Predicate<List<String>>. Predicate should check all values
    // of the list and return true if all of them start with letter in upper case only.
    public static Predicate<List<String>> isValuesStartWithUpperCase()  {
        String s = "";
        return list -> list.stream().allMatch(s1 -> Character.isUpperCase(s1.charAt(0)));
        // return list -> list.stream().anyMatch((i) -> Character.isUpperCase(i.charAt(0)));

       // throw new UnsupportedOperationException("You should implement this method.");
    }

    public Consumer<List<Integer>> addEvenValuesAtTheEnd() {
        throw new UnsupportedOperationException("You should implement this method.");
       // return list -> System.out.println(list + list.stream().flatMap(x))
    }

    public Supplier<List<String>> filterCollection(List<String> values) {
        throw new UnsupportedOperationException("You should implement this method.");
    }

    public Function<List<String>, Map<String, Integer>> stringSize() {

        throw new UnsupportedOperationException("You should implement this method.");
    }

    public static BiFunction<List<Integer>, List<Integer>, List<Integer>> concatList() {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> arrayList1 = new ArrayList<>();
        ArrayList arrayList2 = new ArrayList<>();
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList1.add(3);
//        arrayList1.add(4);
        arrayList2.addAll(arrayList);
        arrayList2.addAll(arrayList1);
        System.out.println(arrayList2);

        List<Integer> list3 = Stream.of(arrayList,arrayList1).flatMap(x -> x.stream()).collect(Collectors.toList());

        System.out.println(list3);
        // return new <List<Integer>, List<Integer>, List<Integer>>;


         return (list, list1) -> Stream.of(list,list1).flatMap(x -> x.stream()).collect(Collectors.toList());        //throw new UnsupportedOperationException("You should implement this method.");
    };

    public static void main(String[] args) {
        System.out.println("hello");
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<String>  stringList = new ArrayList<>();
        list.add(1);
        list.add(2);
        list1.add(3);
        list1.add(4);
        stringList.add("as");
        stringList.add("gsdf");
        stringList.add("ASSsd");
        System.out.println(isValuesStartWithUpperCase().test(stringList));

        ArrayList arrayList = new ArrayList<>();
        ArrayList arrayList1 = new ArrayList<>();
        arrayList.add(1);
        arrayList1.add(2);

        System.out.println(concatList().apply(list,list1));
    }
}
