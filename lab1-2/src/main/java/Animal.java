import Annotations.AnimalAnnotation;
import Annotations.Invoke;

@AnimalAnnotation
public class Animal implements IAnimal{
    // fields
    private String classification;
    private int limbCount;
    private int childrenCount;

    // .ctor
    public Animal(String classification, int limbCount, int childrenCount){
        this.classification = classification;
        this.limbCount = limbCount;
        this.childrenCount = childrenCount;
    }

    // methods
    @Invoke
    public void move(){
        System.out.println("Animal moves");
    }

    @Invoke
    public void speak(){
        System.out.println("Animal speaks");
    }

    // getters and setters
    @Override
    public String getClassification() {
        return classification;
    }
    @Override
    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public int getLimbCount() {
        return limbCount;
    }
    @Override
    public void setLimbCount(int limbCount) {
        this.limbCount = limbCount;
    }

    @Override
    public int getChildrenCount() {
        return childrenCount;
    }
    @Override
    public void setChildrenCount(int childrenCount) {
        this.childrenCount = childrenCount;
    }

    // Override
    @Override
    public String toString(){
        return "Classification: " + classification + ", limbs: " + limbCount + ", children: " + childrenCount;
    }
}
