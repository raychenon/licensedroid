package com.raychenon.licensedroid.license;

/**
 * Created by Raymond Chenon
 */
public abstract class OpenSourceLicense {

    abstract public String getName(); // include version

    abstract public String getNotice();

    public String getFullText() {
        return null; // longer than notice
    }

    public String getCopyright() {
        return null; //  Copyright [yyyy] [name of copyright owner]
    }

}
