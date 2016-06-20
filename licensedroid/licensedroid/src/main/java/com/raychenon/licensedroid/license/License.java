package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 */
public enum License {

    APACHE_2(new ApacheLicense20()),
    BSD_2(new BSD2ClauseLicense()),
    BSD_3(new BSD3ClauseLicense()),
    ECLIPSE_10(new EclipsePublicLicense10()),
    LGPL_21(new LGPL21License()),
    LGPL_30(new LGPL30License()),
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