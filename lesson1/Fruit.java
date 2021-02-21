package ru.geekbrains.lesson1;

public abstract class Fruit {
    protected float Weight;

    public Fruit(float Weight){
        this.Weight = Weight;
    }

    public float getWeight() {
        return Weight;
    }
}
