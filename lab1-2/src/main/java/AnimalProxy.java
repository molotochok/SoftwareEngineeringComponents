public class AnimalProxy implements IAnimal {

    private IAnimal animal;

    public AnimalProxy(IAnimal animal){
        this.animal = animal;
    }

    @Override
    public String getClassification() {
        return animal.getClassification();
    }

    @Override
    public void setClassification(String classification) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getLimbCount() {
        return animal.getLimbCount();
    }

    @Override
    public void setLimbCount(int limbCount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int getChildrenCount() {
        return animal.getChildrenCount();
    }

    @Override
    public void setChildrenCount(int childrenCount) {
        throw new UnsupportedOperationException();
    }
}
