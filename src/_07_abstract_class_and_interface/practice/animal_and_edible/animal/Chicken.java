package _07_abstract_class_and_interface.practice.animal_and_edible.animal;

import _07_abstract_class_and_interface.practice.animal_and_edible.edible.Edible;

public class Chicken extends Animal implements Edible {

    @Override
    public String howToEat() {
        return "Chicken could be fried...to eat";
    }

    @Override
    public String makeSound() {
        return "Chicken: cluck cluck";
    }
}
