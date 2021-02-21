package ru.geekbrains.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {

    private  List<T> fruitBox = new ArrayList<>();

    public void addFruit(T fruit){
        fruitBox.add(fruit);
    }

    public float getWeight(){
        if (fruitBox.size() > 0){
            return fruitBox.size() * fruitBox.get(0).getWeight();
        }
        return 0;
    }

    public boolean compare(Box<?> box){
        return this.getWeight() == box.getWeight();
    }

}
