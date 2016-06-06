package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.License;

/**
 * Created by Raymond Chenon
 */
public class OpenSource {

    private final String libraryName;

    private final String author;

    private String licenseText;
    private License license;

    public final boolean isLicenseText;

    public OpenSource(String libraryName, String author, String license) {
        this.libraryName = libraryName;
        this.author = author;
        this.licenseText = license;
        isLicenseText = true;
    }

    public OpenSource(String libraryName, String author, License license) {
        this.libraryName = libraryName;
        this.author = author;
        this.license = license;
        isLicenseText = false;
    }


    public String getName() {
        return libraryName;
    }

    public String getAuthor() {
        return author;
    }

    public String getLicenseText() {
        return licenseText;
    }

    public License getLicense() {
        return license;
    }

}
