package com.adobe.aem.spectrum.core.models;

import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.wcm.core.components.models.Title;

public interface Heading extends Title, ComponentExporter {

    String getText();

    int getLevel();
}
