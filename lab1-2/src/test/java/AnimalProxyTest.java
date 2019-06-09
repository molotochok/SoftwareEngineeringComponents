import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnimalProxyTest {
    private static AnimalProxy proxy;

    @BeforeClass
    public static void before() {
        proxy = new AnimalProxy(new Animal("Classification", 4, 100));
    }

    // getters
    // correct
    @Test
    public void getChildrenCount(){
        Assert.assertEquals(100, proxy.getChildrenCount());
    }
    @Test
    public void getClassification(){
        Assert.assertEquals("Classification", proxy.getClassification());
    }
    @Test
    public void getLimbCount(){
        Assert.assertEquals(4, proxy.getLimbCount());
    }
    // not correct
    @Test
    public void getBadChildrenCount(){
        Assert.assertNotEquals(101, proxy.getChildrenCount());
    }
    @Test
    public void getBadClassification(){
        Assert.assertNotEquals("Text", proxy.getClassification());
    }
    @Test
    public void getBadLimbCount(){
        Assert.assertNotEquals(3, proxy.getLimbCount());
    }


    // setters
    @Test(expected = UnsupportedOperationException.class)
    public void setChildrenCount() {
        proxy.setChildrenCount(10);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void setClassification() {
        proxy.setClassification("Some classification");
    }
    @Test(expected = UnsupportedOperationException.class)
    public void setLimbCount() {
        proxy.setLimbCount(5);
    }
}
