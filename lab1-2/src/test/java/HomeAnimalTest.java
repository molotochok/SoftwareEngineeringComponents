import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class HomeAnimalTest {
    private static HomeAnimal homeAnimal;

    @BeforeClass
    public static void before(){
        homeAnimal = new HomeAnimal("Home Animal", 2, 50, "Rex");
    }

    // getters
    // correct
    @Test
    public void getChildrenCount(){
        Assert.assertEquals(50, homeAnimal.getChildrenCount());
    }
    @Test
    public void getClassification(){
        Assert.assertEquals("Home Animal", homeAnimal.getClassification());
    }
    @Test
    public void getLimbCount(){
        Assert.assertEquals(2, homeAnimal.getLimbCount());
    }
    @Test
    public void getName(){
        Assert.assertEquals("Rex", homeAnimal.getName());
    }
    // not correct
    @Test
    public void getBadChildrenCount(){
        Assert.assertNotEquals(2121, homeAnimal.getChildrenCount());
    }
    @Test
    public void getBadClassification(){
        Assert.assertNotEquals("Text", homeAnimal.getClassification());
    }
    @Test
    public void getBadLimbCount(){
        Assert.assertNotEquals(123123, homeAnimal.getLimbCount());
    }
    @Test
    public void getBadName(){
        Assert.assertNotEquals("Happy", homeAnimal.getName());
    }


    // setters
    @Test
    public void setChildrenCount() {
        int childrenCount = homeAnimal.getChildrenCount();

        homeAnimal.setChildrenCount(25);
        Assert.assertEquals(25,homeAnimal.getChildrenCount());

        homeAnimal.setChildrenCount(childrenCount);
    }
    @Test
    public void setClassification() {
        String classification = homeAnimal.getClassification();

        homeAnimal.setClassification("DOGGGE");
        Assert.assertEquals("DOGGGE",homeAnimal.getClassification());

        homeAnimal.setClassification(classification);
    }
    @Test
    public void setLimbCount() {
        int limbCount = homeAnimal.getLimbCount();

        homeAnimal.setLimbCount(69);
        Assert.assertEquals(69,homeAnimal.getLimbCount());

        homeAnimal.setLimbCount(limbCount);
    }
    @Test
    public void setName(){
        String name = homeAnimal.getName();

        homeAnimal.setName("Lucas");
        Assert.assertEquals("Lucas", homeAnimal.getName());

        homeAnimal.setName(name);
    }
}
