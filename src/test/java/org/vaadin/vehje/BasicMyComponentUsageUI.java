package org.vaadin.vehje;

import com.vaadin.ui.Component;
import com.vaadin.ui.VerticalLayout;
import org.vaadin.addonhelpers.AbstractTest;
import org.vaadin.delayedbutton.DelayedButton;

/**
 * Add many of these with different configurations,
 * combine with different components, for regressions
 * and also make them dynamic if needed.
 */
public class BasicMyComponentUsageUI extends AbstractTest {

    @Override
    public Component getTestComponent() {
        MyComponent clearableTextBox = new MyComponent();
        // Now you can use add-ons in tests (without making a dependency to it)
        DelayedButton delayedButton = new DelayedButton("Wait for it...", 5);
        return new VerticalLayout(clearableTextBox, delayedButton);
    }

}
