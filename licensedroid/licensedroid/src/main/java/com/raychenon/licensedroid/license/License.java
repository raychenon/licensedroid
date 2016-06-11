package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 */
public enum License {

    APACHE_2(new ApacheLicense20()),
    BSD2(new BSD2ClauseLicense()),
    BSD3(new BSD3ClauseLicense()),
    MIT(new MITLicense()),
    MOZILLA_PUBLIC_LICENSE(new MozillaPublicLicense20());

    private LicenseInfos value;

    License(final LicenseInfos value) {
        this.value = value;
    }

    public LicenseInfos get() {
        return value;
    }
}