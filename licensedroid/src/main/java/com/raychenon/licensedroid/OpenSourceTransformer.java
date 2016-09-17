package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.LicenseInfos;

/**
 * @author Raymond Chenon
 */
public class OpenSourceTransformer {

    public OpenSourceTransformer() {
    }

    public OpenSourceModel transform(final OpenSource openSource) {

        return new OpenSourceModel(openSource.getProjectName(), openSource.getAuthor(), extractLicenseText(openSource),extractName(openSource));
    }

    private String extractLicenseText(final OpenSource openSource) {
        if (openSource.isLicenseText) {
            return openSource.getLicenseText();
        } else {
            LicenseInfos sourceLicense = openSource.getLicense();
            if (sourceLicense.hasCopyrightFormat()) {
                return sourceLicense.getNiceCopyright(sourceLicense.getYear(), openSource.getAuthor()) + "\n" + sourceLicense.getLicenseText();
            } else {
                return sourceLicense.getLicenseText();
            }
        }
    }

    private String extractName(final OpenSource openSource) {
        if (openSource.getLicense() == null){
            // TODO extract the first words
            return openSource.getLicenseText().substring(0,15) + "...";
        }
        return openSource.getLicense().getName();
    }

}
