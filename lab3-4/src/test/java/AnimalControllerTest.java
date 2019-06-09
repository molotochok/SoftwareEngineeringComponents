import Controller.AnimalController;
import Model.HomeAnimal;
import Model.IAnimal;
import View.ConsoleView;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class AnimalControllerTest {
    private ConsoleView view;
    private IAnimal animal;
    private AnimalController controller;

    @Test
    public void controllerTest() {
        view = mock(ConsoleView.class);
        animal = new HomeAnimal("Cat", 4, 10, "Pushok");
        controller = new AnimalController(view, animal);

        when(mock(AnimalController.class).getAnimal()).thenReturn(animal);
    }
}
