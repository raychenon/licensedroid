package com.raychenon.licensedroid;

/**
 * @author Raymond Chenon
 */
public class OpenSourceUIModel {

    private final String author;
    private final String licenseDescription;
    private final String libraryName;

    public OpenSourceUIModel(String libraryName, String author, String licenseDescription) {
        this.libraryName = libraryName;
        this.author = author;
        this.licenseDescription = licenseDescription;
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

}
