package com.raychenon.licensedroid;

/**
 * @author Raymond Chenon
 */
public class OpenSourceModel {

    public final String author;
    public final String libraryName;
    public final License license;

    public OpenSourceModel(final String libraryName, final String author, final License license) {
        this.libraryName = libraryName;
        this.author = author;
        this.license = license;
    }

    public static class License {
        public final String name;
        public final String text;
        public final String fullDescription;

        public License(String name, String text, String fullDescription) {
            this.name = name;
            this.text = text;
            this.fullDescription = fullDescription == null ? text : fullDescription;
        }
    }

}
