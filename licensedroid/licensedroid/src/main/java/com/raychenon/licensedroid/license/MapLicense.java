package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 * mapping
 */
public class MapLicense {

    public static LicenseInfos MIT(){
        return new MITLicense();
    }

    public static LicenseInfos APACHE2(final int year){
        return new ApacheLicense20(year);
    }
}
