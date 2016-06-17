package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.LicenseInfos;

/**
 * @author Raymond Chenon
 */
public class OpenSourceTransformer {

    public OpenSourceTransformer() {
    }

    public OpenSourceUIModel transform(final OpenSource openSource) {

        return new OpenSourceUIModel(openSource.getName(), openSource.getAuthor(), extractLicenseText(openSource));
    }

    private String extractLicenseText(final OpenSource openSource) {
        if (openSource.isLicenseText) {
            return openSource.getLicenseText();
        } else {
            LicenseInfos sourceLicense = openSource.getLicense().get();
            if (sourceLicense.hasCopyrightFormat()) {
                return sourceLicense.getNiceCopyright(openSource.getYear(), openSource.getAuthor()) + "\n" + sourceLicense.getDescription();
            } else {
                return sourceLicense.getDescription();
            }
        }
    }

}
