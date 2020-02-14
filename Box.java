package leson1.classwork;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    private ArrayList<T> storage;

    public Box() {
        ArrayList<T> storage = new ArrayList<>();
    }

    public void addFruit(T fruit){

    }

    public double getWeight(){
        double weght = 0;
        for (T t : storage){
            weght += t.getWeight();
        }
        return weght;
    }


}
