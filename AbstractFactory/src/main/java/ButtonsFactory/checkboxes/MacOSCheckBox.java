package ButtonsFactory.checkboxes;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckBox implements CheckBox {

    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
