package ss7_interface_abstract_class.thuc_hanh.thuc_hanh_1.thuc_hanh_lop_animal_interface_edible.animal;

import ss7_interface_abstract_class.thuc_hanh.thuc_hanh_1.thuc_hanh_lop_animal_interface_edible.edible.Edible;

public class Chicken  extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }
    @Override
    public String howToEat() {
        return "could be fried";
    }
}
