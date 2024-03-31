package ButtonsFactory.factories;

import ButtonsFactory.buttons.Button;
import ButtonsFactory.checkboxes.CheckBox;

/**
 * Abstract factory knows about all (abstract) product types.
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckbox();
}
