package Service;

import Model.IAnimal;

public class AnimalService implements IAnimalService {

    private IAnimal animal;

    public AnimalService(IAnimal animal){
        this.animal = animal;
    }


    // methods
    public String move(){
        String result = animal.toString() + " moves";
        return result;
    }

    public String speak(){
        String result = animal.toString() + " speaks";
        return result;
    }
}
