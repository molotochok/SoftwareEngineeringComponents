package Factory;

import Model.IAnimal;
import Service.AnimalService;
import Service.IAnimalService;


public class ServiceFactory {
    //region Factory
    private static ServiceFactory instance;

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        if(instance == null){
            instance = new ServiceFactory();
        }
        return instance;
    }
    //endregion

    public IAnimalService createService(IAnimal animal){
        return new AnimalService(animal);
    }
}
