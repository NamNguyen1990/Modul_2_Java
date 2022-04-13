package AnimalvainterfaceEdible.Animal;

import AnimalvainterfaceEdible.fruit.Apple;
import AnimalvainterfaceEdible.fruit.Fruit;
import AnimalvainterfaceEdible.fruit.Orange;

public class MainChinh {
    public static void main(String[] args) {
        Tiger tiger= new Tiger();
        System.out.println(tiger);

        Chicken chicken = new Chicken();
        System.out.println(chicken.makeSound());

        Chicken chicken1 = new Chicken();
        System.out.println(chicken1.makeSound());
        System.out.println(chicken1.howToEat());

        Orange orange = new Orange();
        System.out.println(orange.howToEat());
        Apple apple = new Apple();
        System.out.println(apple.howToEat());

    }
}
