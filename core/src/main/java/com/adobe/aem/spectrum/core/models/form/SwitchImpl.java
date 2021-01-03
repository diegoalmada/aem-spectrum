package com.adobe.aem.spectrum.core.models.form;

import com.adobe.aem.spectrum.core.models.BaseComponentExporterImpl;
import com.adobe.cq.export.json.ComponentExporter;
import com.adobe.cq.export.json.ExporterConstants;
import lombok.Getter;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = SlingHttpServletRequest.class,
        adapters = { Switch.class, ComponentExporter.class},
        resourceType = SwitchImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
@Getter
public class SwitchImpl extends BaseComponentExporterImpl
    implements Switch {

    protected static final String RESOURCE_TYPE = "aem-spectrum/components/content/form/switch";

    @ValueMapValue
    private String text;

    @ValueMapValue
    private String accessibilityLabel;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean selected;

}
