package com.raychenon.licensedroid;

import android.support.annotation.VisibleForTesting;

import com.raychenon.licensedroid.license.LicenseInfos;

/**
 * @author Raymond Chenon
 */
@VisibleForTesting
class OpenSourceTransformer {

    public OpenSourceTransformer() {
    }

    public OpenSourceModel transform(final OpenSource openSource) {
        return new OpenSourceModel(combineLibName(openSource), openSource.getAuthor(), constructLicense(openSource),convertExtra(openSource));
    }

    private OpenSourceModel.License constructLicense(final OpenSource openSource) {
        return new OpenSourceModel.License(extractLicenseName(openSource), extractLicenseText(openSource), extractLicenseFullDescription(openSource));
    }

    private String combineLibName(final OpenSource openSource) {
        if (openSource.getVersion() != null){
            return openSource.getProjectName() + " " + openSource.getVersion();
        }
        return  openSource.getProjectName();
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

    private String extractLicenseName(final OpenSource openSource) {
        if (openSource.getLicense() == null) {
            // custom license
            int endIndex = openSource.getLicenseText().indexOf(" ", 20);
            return openSource.getLicenseText().substring(0, endIndex) + " ...";
        }
        return openSource.getLicense().getName();
    }

    private String extractLicenseFullDescription(final OpenSource openSource) {
        if (openSource.getLicense() != null && openSource.getLicense().hasLongerLicenseText()) {
            return openSource.getLicense().getLongerLicenseText();
        }
        return openSource.getLicenseText();
    }

    private OpenSourceModel.Extras convertExtra(final OpenSource openSource){
        return new OpenSourceModel.Extras(openSource.getVersion(),openSource.getGitRepoUrl());
    }

}
