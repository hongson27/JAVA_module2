package ss7_Abstract_and_Interfaces.thuc_hanh.Animal;

public class Tiger extends Animal implements Edible {
    @Override
    public void makeSound() {
        System.out.println("Tiger: Roar!");
    }

    @Override
    public String howToEat() {
        return "Tiger eats meat.";
    }
}

