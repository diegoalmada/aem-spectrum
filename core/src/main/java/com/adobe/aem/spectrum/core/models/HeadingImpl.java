package com.adobe.aem.spectrum.core.models;


import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import com.day.cq.commons.jcr.JcrConstants;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

import javax.inject.Named;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = { Heading.class, ComponentExporter.class},
        resourceType = HeadingImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
@Getter
public class HeadingImpl extends BaseComponentExporterImpl implements Heading {

    protected static final String RESOURCE_TYPE = "aem-spectrum/components/content/heading";

    @ValueMapValue
    @Named(JcrConstants.JCR_TITLE)
    private String text;

    @ValueMapValue
    @Default(intValues = 1)
    private int level;
}
