package com.raychenon.licensedroid;

/**
 * Created by Raymond Chenon
 */
public class OpenSource {

    private final String libraryName;

    private final String author;

    private final String license;

    public OpenSource(String libraryName, String author, String license) {
        this.libraryName = libraryName;
        this.author = author;
        this.license = license;
    }

    public String getName() {
        return libraryName;
    }

    public String getAuthor() {
        return author;
    }

    public String getLicense() {
        return license;
    }

}
