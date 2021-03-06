package com.adobe.aem.spectrum.core.models.form;

import com.adobe.cq.export.json.ComponentExporter;

public interface Switch extends ComponentExporter {

    String getText();

    String getAccessibilityLabel();

    boolean isSelected();

}
