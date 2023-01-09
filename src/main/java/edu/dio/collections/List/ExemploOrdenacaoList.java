package edu.dio.collections.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import edu.dio.collections.List.ExemploOrdenacaoList.Cat;

public class ExemploOrdenacaoList {

    public class Cat implements Comparable<Cat> {
        private String name;
        private Integer age;
        private String color;

        public Cat(String name, Integer age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public String getColor() {
            return color;
        }

        public String toString() {
            return "[Nome " + name + ", Idade " + age + ", Cor " + color + "]";
        }

        public int compareTo(Cat myCat) {
            return this.getName().compareToIgnoreCase(myCat.getName());
        }

    }

    public static void main(String[] args) {
        ExemploOrdenacaoList exmpOrdList = new ExemploOrdenacaoList();
        exmpOrdList.myCats();
        System.out.println();
    }

    public void myCats() {
        List<Cat> myCats = new ArrayList<>() {
            {
                add(new Cat("Cosette", 2, "White"));
                add(new Cat("Meniniho", 4, "Black"));
                add(new Cat("Ravenna", 5, "Black"));
            }
        };
        myCats.sort(Comparator.comparing(Cat::getName));

        System.out.println("\n\tOrdem de inserção:\t\n" + myCats);

        Collections.sort(myCats);
        System.out.println("\n\tOrdem natural:\t\n" + myCats);

        Collections.shuffle(myCats);
        System.out.println("\n\tOrdem aleatória:\t\n" + myCats);

        Collections.sort(myCats, new ComparatorAge());
        //ou ||
        myCats.sort(new ComparatorAge());
        System.out.println("\n\tOrdem idade\t\n" + myCats);
        
        Collections.sort(myCats, new ComparatorNameAgeColor());
        //ou ||
        myCats.sort(new ComparatorNameAgeColor());
        System.out.println("\n\tOrdem nome/idade/cor\t\n" + myCats);

    }

}

class ComparatorAge implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}

class ComparatorNameAgeColor implements Comparator<Cat> {

    @Override
    public int compare(Cat cat1, Cat cat2) {
        int name = cat1.getName().compareToIgnoreCase(cat2.getName());
        if (name != 0)
            return name;

        int color = cat1.getColor().compareToIgnoreCase(cat2.getColor());
        if (color != 0)
            return color;

        return Integer.compare(cat1.getAge(), cat2.getAge());
    }
}