package ButtonsFactory.app;

import ButtonsFactory.buttons.Button;
import ButtonsFactory.factories.GUIFactory;
import ButtonsFactory.checkboxes.CheckBox;

/**
 * Factory users don't care which concrete factory they use since they work with
 * factories and products through abstract interfaces.
 */
public class Application {
    private final Button button;
    private final CheckBox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}