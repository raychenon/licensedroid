package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 * mapping
 */
public class MapLicense {

    public static LicenseInfos MIT(final int year){
        return new MITLicense(year);
    }

    public static LicenseInfos APACHE2(final int year){
        return new ApacheLicense20(year);
    }
}
