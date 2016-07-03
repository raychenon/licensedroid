package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 * used as Map but not a map underneath
 */
public class MapLicense {

    public static LicenseInfos APACHE2(final int year){
        return new ApacheLicense20(year);
    }

    public static LicenseInfos BSD_2(){
        return new BSD2ClauseLicense();
    }

    public static LicenseInfos BSD_3(){
        return new BSD3ClauseLicense();
    }

    public static LicenseInfos ECLIPSE_10(){
        return new EclipsePublicLicense10();
    }

    public static LicenseInfos LGPL_21(){
        return new LGPL21License();
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
