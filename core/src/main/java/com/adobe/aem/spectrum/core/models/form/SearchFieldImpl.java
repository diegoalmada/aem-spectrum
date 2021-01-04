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
        adapters = { SearchField.class, ComponentExporter.class},
        resourceType = SearchFieldImpl.RESOURCE_TYPE,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
@Getter
public class SearchFieldImpl extends BaseComponentExporterImpl
        implements SearchField {

    protected static final String RESOURCE_TYPE = "aem-spectrum/components/content/form/search-field";

    @ValueMapValue
    private String label;

    @ValueMapValue
    private String accessibilityLabel;

    @ValueMapValue
    private String placeholder;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean quiet;

}
