package edu.dio.collections.dicas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

class DicasCollection {
    public static void main(final String[] args) {
        final String number1 = "1";
        final String number2 = "2";
        final String number3 = "3";

        final ArrayList<String> numbers = new ArrayList<>();
        numbers.add(number3);
        numbers.add(number2);
        numbers.add(number1);
        numbers.add(number3);
        
        System.out.println(numbers);

        Collections.sort(numbers);

        System.out.println(numbers);

        final HashSet<String> hashSet = new HashSet<>(numbers);
        System.out.println(hashSet);
    }
}