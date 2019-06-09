package Controller;

import Factory.ServiceFactory;
import Model.IAnimal;
import Service.IAnimalService;
import View.ConsoleView;

public class AnimalController {
    private ConsoleView view;
    private IAnimal animal;
    private IAnimalService animalService;

    public AnimalController(ConsoleView view, IAnimal animal) {
        this.view = view;
        this.animal = animal;
        animalService = ServiceFactory.getInstance().createService(animal);
    }

    public IAnimal getAnimal(){
        return animal;
    }

    public void move() {
        view.println(animalService.move());
    }

    public void speak() {
        view.println(animalService.speak());
    }
}
