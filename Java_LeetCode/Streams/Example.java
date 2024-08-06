package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author - yogesh
 */
public class Example {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Mango","Banana"));
        List<String> veggies = new ArrayList<>(Arrays.asList("onion", "potato","cucumber"));

        List<List<String>> food = new ArrayList<>();
        food.add(fruits);
        food.add(veggies);
        System.out.println(food+" :Before");

        List<String> mapOP = veggies.stream().map(String::toUpperCase)
                .toList();
        System.out.println(mapOP+" : Implemented map operation ");

        List<String> flatMapOP = food.stream()
                .flatMap(Collection::stream).map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(flatMapOP+" : Implemented Flatmap operation ");

        int reduceOP = veggies.stream()
                .reduce(0,(acc, item)-> acc+1, Integer::sum);
        System.out.println(reduceOP+" : Implemented reduce operation ");

        int mOP = veggies.stream()
                .mapToInt(String::length)
                .sum();
        System.out.println(mOP+" : Implemented mapToInt operation ");






    }
}
