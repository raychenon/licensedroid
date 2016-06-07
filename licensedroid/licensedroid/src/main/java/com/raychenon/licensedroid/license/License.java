package com.raychenon.licensedroid.license;

/**
 * Created by Raymond Chenon
 */
public enum License {

    APACHE_2(new ApacheLicense20()),
    MIT(new MITLicense());

    private LicenseInfos value;

    License(final LicenseInfos value) {
        this.value = value;
    }

    public LicenseInfos get() {
        return value;
    }
}