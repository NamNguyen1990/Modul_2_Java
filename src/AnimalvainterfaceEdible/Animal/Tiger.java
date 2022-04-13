package AnimalvainterfaceEdible.Animal;

public class Tiger extends Animal{

    @Override
    public String makeSound() {
        return "Bố là mày là Hổ đây";
    }

    @Override
    public String toString() {
        return makeSound();
    }
}
