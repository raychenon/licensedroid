package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 * used as key-value with different constructors but not a Map underneath
 */
public class MapLicense {

    public static LicenseInfos APACHE2(final int year){
        return new ApacheLicense20(year);
    }

    public static LicenseInfos BSD_2(final int year){
        return new BSD2ClauseLicense(year);
    }

    public static LicenseInfos BSD_3(final int year){
        return new BSD3ClauseLicense(year);
    }

    public static LicenseInfos ECLIPSE_10(){
        return new EclipsePublicLicense10();
    }

    public static LicenseInfos LGPL_21(final int year){
        return new LGPL21License(year);
    }

    public static LicenseInfos LGPL_30(){
        return new LGPL30License();
    }

    public static LicenseInfos MIT(final int year){
        return new MITLicense(year);
    }

    public static LicenseInfos MOZILLA_PUBLIC_LICENSE(){
        return new MozillaPublicLicense20();
    }

}
