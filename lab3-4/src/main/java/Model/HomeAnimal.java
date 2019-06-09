package Model;

import Annotations.*;
import Model.Animal;

@AnimalAnnotation
public class HomeAnimal extends Animal {

    private String name;

    public HomeAnimal(String classification, int limbCount, int childrenCount, String name) {
        super(classification, limbCount, childrenCount);

        this.name = name;
    }


    @Override
    public String toString(){
        return super.toString() + ", name: " + this.name;
    }

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
