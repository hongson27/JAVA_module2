package ss7_Abstract_and_Interfaces.thuc_hanh.Animal;

import java.sql.SQLOutput;

public class test {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makeSound();
            if (animal instanceof Chicken) {
//                Edible edible = (Chicken) animal;
                System.out.println(((Chicken) animal).howToEat());
            }
        }


        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Apple();
        fruits[1] = new Orange();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
