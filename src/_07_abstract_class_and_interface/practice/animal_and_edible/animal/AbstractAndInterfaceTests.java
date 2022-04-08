package _07_abstract_class_and_interface.practice.animal_and_edible.animal;
import _07_abstract_class_and_interface.practice.animal_and_edible.animal.Animal;
import _07_abstract_class_and_interface.practice.animal_and_edible.animal.Tiger;
import _07_abstract_class_and_interface.practice.animal_and_edible.animal.Chicken;
import _07_abstract_class_and_interface.practice.animal_and_edible.edible.Edible;
import _07_abstract_class_and_interface.practice.animal_and_edible.fruit.Fruit;
import _07_abstract_class_and_interface.practice.animal_and_edible.fruit.Orange;
import _07_abstract_class_and_interface.practice.animal_and_edible.fruit.Apple;
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
    Animal [] animals = new Animal[2];
    animals[0] = new Tiger();
    animals[1] = new Chicken();
    for(Animal items : animals){
        System.out.println(items.makeSound());;
        if ( items instanceof Chicken) {
            Edible edibler = (Chicken) items;
            System.out.println(edibler.howToEat());
            }
        }
        Fruit [] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit item : fruits) {
            System.out.println(item.howToEat());
        }
    }
}
