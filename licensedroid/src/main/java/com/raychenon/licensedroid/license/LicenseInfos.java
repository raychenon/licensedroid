package com.raychenon.licensedroid.license;

import java.io.Serializable;

/**
 * @author Raymond Chenon
 */
public abstract class LicenseInfos implements Serializable {

    public final String YEAR = "[yyyy]";
    public final String COPYRIGHT_HOLDER = "[owner]";

    protected int year;

    abstract public String getName(); // include version


    abstract public String getLicenseText();

    /**
     * optional if the license contains 2 descriptions
     * @return the longer version of license
     */
    public String getLongerLicenseText() {
        return null;
    }

    public String getCopyrightFormat() {
        return null; //  Copyright [yyyy] [name of copyright owner]
    }

    public boolean hasCopyrightFormat(){
        return getCopyrightFormat() != null;
    }

    public String getNiceCopyright(final Integer year, final String holder){
        String copyright = getCopyrightFormat()
                .replace(YEAR,String.valueOf(year))
                .replace(COPYRIGHT_HOLDER,holder);
        return copyright;
    }

    public boolean hasShortDescription(){
        return getLicenseText() != null;
    }

    public int getYear(){
        return year;
    }

}
