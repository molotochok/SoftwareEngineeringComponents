package Model;

public interface IAnimal {
    String getClassification();
    void setClassification(String classification);
    int getLimbCount();
    void setLimbCount(int limbCount);
    int getChildrenCount();
    void setChildrenCount(int childrenCount);
}
