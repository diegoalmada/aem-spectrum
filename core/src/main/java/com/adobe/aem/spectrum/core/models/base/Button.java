package com.adobe.aem.spectrum.core.models.base;

import com.adobe.aem.spectrum.core.models.utilities.StyleSystem;
import com.adobe.cq.export.json.ComponentExporter;

public interface Button extends com.adobe.cq.wcm.core.components.models.Button, ComponentExporter {

    String getText();

    String getAccessibilityLabel();

    StyleSystem getStyle();
}
