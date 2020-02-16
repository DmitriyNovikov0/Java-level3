package leson1.classwork;

import java.util.ArrayList;

public class Box<T extends Fruit>{
    private T fruit;
    private ArrayList<T> storage;

    public Box(T fruit) {
        storage = new ArrayList<>();
        this.fruit = fruit;
    }

    public void addFruit(T fruit){
        storage.add(fruit);
    }

    public double getWeight(){
        return storage.size() * fruit.getWeight();
    }

    public boolean compare(Box fruitBox) {
        return (fruitBox.getWeight() == this.getWeight())? true : false;
    }

    public T getFruit() {
        return fruit;
    }

    public void moveTo(Box fruitBox){
        if(this.fruit.equals(fruitBox.getFruit()) && !fruitBox.equals(this)){
            for(int i = 0; i < storage.size(); i++){
                fruitBox.addFruit(fruit);
            }
            storage.clear();
        }
    }

}
