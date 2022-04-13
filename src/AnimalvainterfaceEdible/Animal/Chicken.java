package AnimalvainterfaceEdible.Animal;

import AnimalvainterfaceEdible.edible.edible;

public class Chicken extends Animal implements edible {

    @Override
    public String makeSound() {
        return "Gà không bao giờ sợ chó";
    }

    @Override
    public String howToEat() {
        return "Có thể ăn được những cái vớ vẩn";
    }
}
