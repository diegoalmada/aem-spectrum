package com.adobe.aem.spectrum.core.models.utilities;

import com.adobe.cq.export.json.ExporterConstants;
import lombok.Getter;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.models.annotations.Default;
import org.apache.sling.models.annotations.DefaultInjectionStrategy;
import org.apache.sling.models.annotations.Exporter;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.models.annotations.injectorspecific.ValueMapValue;

@Model(
        adaptables = Resource.class,
        adapters = StyleSystem.class,
        defaultInjectionStrategy = DefaultInjectionStrategy.OPTIONAL
)
@Exporter(
        name = ExporterConstants.SLING_MODEL_EXPORTER_NAME,
        extensions = ExporterConstants.SLING_MODEL_EXTENSION
)
@Getter
public class StyleSystemImpl implements StyleSystem {

    @ValueMapValue
    @Default(values = "cta")
    private String variant;

    @ValueMapValue
    @Default(booleanValues = false)
    private boolean quiet;
}
