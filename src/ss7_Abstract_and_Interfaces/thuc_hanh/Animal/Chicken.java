package ss7_Abstract_and_Interfaces.thuc_hanh.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Chicken: Cock-a-doodle-doo");
    }

    @Override
    public String howToEat() {
        return "Chicken eats rice.";
    }
}
