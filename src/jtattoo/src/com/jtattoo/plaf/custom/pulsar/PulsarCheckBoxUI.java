/*
 * Copyright 2005 MH-Software-Entwicklung. All rights reserved.
 * Use is subject to license terms.
 */
package com.jtattoo.plaf.custom.pulsar;

import javax.swing.*;
import javax.swing.plaf.*;

/**
 * @author Michael Hagen
 */
public class PulsarCheckBoxUI extends PulsarRadioButtonUI {

    private static PulsarCheckBoxUI checkBoxUI = null;

    public static ComponentUI createUI(JComponent b) {
        if (checkBoxUI == null) {
            checkBoxUI = new PulsarCheckBoxUI();
        }
        return checkBoxUI;
    }

    public void installDefaults(AbstractButton b) {
        super.installDefaults(b);
        icon = UIManager.getIcon("CheckBox.icon");
    }
}
