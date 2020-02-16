package leson1.classwork;

public class Task3 {

    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox1 = new Box<>(apple);
        Box<Apple> appleBox2 = new Box<>(apple);
        Box<Orange> orangeBox1 = new Box<>(orange);

        for (int i = 1; i <= 15; i++){
            appleBox1.addFruit(apple);
        }
        System.out.println("Вес коробки с яблоками = " + Double.toString(appleBox1.getWeight()) + " f");
//        appleBox1.addFruit(orange); ошибка на этапе компиляции
        for (int i = 1; i <= 25; i++){
            appleBox2.addFruit(apple);
        }

        for (int i = 1; i <= 10; i++){
            orangeBox1.addFruit(orange);
        }
        System.out.println("Вес коробки с апельсинами = " + Double.toString(orangeBox1.getWeight()) + " f");
//------ сравним вес коробок с фруктами
        System.out.println(orangeBox1.compare(appleBox1));
        System.out.println(orangeBox1.compare(appleBox2));
//------ пересыпим фрукты
        //пробую пересыпать яблоки в апельсины
        appleBox1.moveTo(orangeBox1);
        System.out.println("Вес коробки с яблоками = " + Double.toString(appleBox1.getWeight()) + " f");
        System.out.println("Вес коробки с апельсинами = " + Double.toString(orangeBox1.getWeight()) + " f");
        //пересыпаю яблоки в яблоки\
        appleBox1.moveTo(appleBox2);
        System.out.println("Вес 1 коробки с яблоками = " + Double.toString(appleBox1.getWeight()) + " f");
        System.out.println("Вес 2 коробки с яблоками = " + Double.toString(appleBox2.getWeight()) + " f");
        //ради эксперемента каробку пересыплю саму в себя :), пришлось добавить && !fruitBox.equals(this) проверку объекта сам на себя происходит зацикливание
        appleBox2.moveTo(appleBox2);
        System.out.println("Вес 2 коробки с яблоками = " + Double.toString(appleBox2.getWeight()) + " f");

    }

}
