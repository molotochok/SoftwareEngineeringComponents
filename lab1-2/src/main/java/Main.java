import Annotations.Invoke;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        // Task 1
        Animal homeAnimal = new HomeAnimal("lul",1,4,"Markiian");

        System.out.println("\n<------- Home Animal ------->");
        System.out.println(homeAnimal);

        // Task 2
        System.out.println("\n<------- Invoke ------->");
        for(Method m: homeAnimal.getClass().getMethods()){
            if(m.isAnnotationPresent(Invoke.class)){
                System.out.println("Invoking: " + m);
                m.invoke(homeAnimal);
            }
        }

        // Task 3
        System.out.println("\n<------- Class name ------->");
        System.out.println(homeAnimal.getClass().getSimpleName());

        System.out.println("\n<------- Class fields ------->");
        for(Field f: homeAnimal.getClass().getDeclaredFields()){
            System.out.println(f);
        }

        System.out.println("\n<------- Class attributes ------->");
        for(Annotation a: homeAnimal.getClass().getAnnotations()){
            System.out.println(a);
        }


        // Task  4 (proxy)
        System.out.println("\n<------- Proxy ------->");
        IAnimal animal = new Animal("Dogge", 4,10);
        IAnimal animalProxy = new AnimalProxy(animal);

        System.out.println("Animal classification: "+ animal.getClassification());
        System.out.println("Proxy classification: "+ animalProxy.getClassification());
        System.out.println("Trying to set value in proxy: ");
        try{
            animalProxy.setChildrenCount(1);
        }
        catch(Exception e){
            System.out.println("Exception of type: " + e);
        }
    }
}
