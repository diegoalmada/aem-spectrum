package com.adobe.aem.spectrum.core.models.base;

import com.adobe.aem.spectrum.core.models.BaseComponentExporterImpl;
import com.adobe.aem.spectrum.core.models.utilities.StyleSystem;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.commons.jcr.JcrConstants;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ChildResource;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Named;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = {Button.class, ComponentExporter.class},
        resourceType = ButtonImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
@Getter
public class ButtonImpl extends BaseComponentExporterImpl
        implements Button {

    protected static final String RESOURCE_TYPE = "aem-spectrum/components/content/button";

    @ValueMapValue
    @Named(JcrConstants.JCR_TITLE)
    private String text;

    @ValueMapValue
    private String accessibilityLabel;

    private String link;


    @ChildResource
    private StyleSystem style;

}
