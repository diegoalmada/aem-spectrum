package com.adobe.aem.spectrum.core.models.form;

import com.adobe.cq.export.json.ComponentExporter;

public interface SearchField extends ComponentExporter {

    String getLabel();

    String getAccessibilityLabel();

    String getPlaceholder();

    boolean isQuiet();
}
