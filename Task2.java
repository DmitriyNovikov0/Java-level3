package leson1.classwork;

import java.util.ArrayList;
import java.util.Collections;

public class Task2 {

    static class Instance<T> {
        T val;

        public void setVal(T val) {
            this.val = val;
        }

        public T getVal() {
            return val;
        }

        public Instance(T val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Instance<Integer>[] arrayOfInteger =  new Instance[15];
        for (int i = 0; i < arrayOfInteger.length; i++){
            arrayOfInteger[i] = new Instance<>(i);
            System.out.print(" " + arrayOfInteger[i].getVal().toString());
        }
        System.out.println();
//меняем местами 2 и 3 эллементы массива
        Instance<?>[] movArr = moveEl(arrayOfInteger);
        for (int i = 0; i < movArr.length; i++){
            System.out.print(" " + movArr[i].getVal());
        }
        System.out.println();

//---------------- 2 задание --------------------------------
        System.out.println("Задание №2");
        //для теста использую строки
        Instance<String>[] arrayOfStrings = new Instance[10];
        for (int i = 0; i < arrayOfStrings.length; i++){
            arrayOfStrings[i] = new Instance<>(Integer.toString(i));
        }
//-------- вывoдим значения
        for (Instance i : arrayToArrayList(arrayOfStrings)){
            if(i != null) {
                System.out.print(" " + i.getVal());
            }
        }

    }

    public static ArrayList<Instance> arrayToArrayList(Instance[] inArray){
        ArrayList<Instance> outArrayList = new ArrayList<>();
        Collections.addAll(outArrayList, inArray);
        return outArrayList;
    }

    public static Instance<?>[] moveEl(Instance<?>[] inArray){
       Instance<?> obj = inArray[2];
       inArray[2] = inArray[3];
       inArray[3] = obj;
       return inArray;
    }


}
