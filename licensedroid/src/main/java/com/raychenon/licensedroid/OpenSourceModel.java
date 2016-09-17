package com.raychenon.licensedroid;

/**
 * @author Raymond Chenon
 */
public class OpenSourceModel {

    private final String author;
    private final String libraryName;
    private final String licenseDescription;
    private final String licenseName;

    public OpenSourceModel(String libraryName, String author, String licenseDescription, final String licenseName) {
        this.libraryName = libraryName;
        this.author = author;
        this.licenseDescription = licenseDescription;
        this.licenseName = licenseName;
    }

    public String getLicense() {
        return licenseDescription;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public String getAuthor() {
        return author;
    }

    public String getLicenseName() {
        return licenseName;
    }

}
