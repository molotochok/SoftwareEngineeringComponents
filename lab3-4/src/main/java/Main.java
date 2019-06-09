import Controller.AnimalController;
import Model.Animal;
import View.ConsoleView;

public class Main {

    public static void main(String[] args){
        ConsoleView view = new ConsoleView();
        AnimalController animalController = new AnimalController(view, new Animal("dogge", 4, 2));

        animalController.move();
        animalController.speak();
    }
}
