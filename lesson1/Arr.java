package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Arr {


    public static void main(String[] args) {
        //#1
        String[] arr  = {"Moon", "Sun"};
        System.out.println(Arrays.toString(arr));
        swap(arr);
        System.out.println(Arrays.toString(arr));
        //#2
        toArrayList(arr);
        System.out.println(Arrays.toString(arr));
        //#3
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> box1 = new Box<Apple>();
        Box<Orange> box2 = new Box<Orange>();
        Box<?> box3 = new Box<>();
        box1.addFruit(apple);
        box1.addFruit(apple);
        box1.addFruit(apple);
        box2.addFruit(orange);
        box2.addFruit(orange);
        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));
    }

    private static <T> void swap(T[] arr){
        T temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

    private static <T> List<T> toArrayList(T[] arr){
        return Arrays.asList(arr);
    }






}
