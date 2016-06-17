package com.raychenon.licensedroid.license;

/**
 * @author Raymond Chenon
 */
public abstract class LicenseInfos {

    public final String YEAR = "[yyyy]";
    public final String COPYRIGHT_HOLDER = "[owner]";

    abstract public String getName(); // include version


    abstract public String getDescription();

    public String getLongDescription() {
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
        return getName() + " - " + copyright;
    }

    public boolean hasShortDescription(){
        return getDescription() != null;
    }

}
