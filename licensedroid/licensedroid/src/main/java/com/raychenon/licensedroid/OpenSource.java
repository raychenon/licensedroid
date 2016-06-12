package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.License;

import java.io.Serializable;

/**
 * @author Raymond Chenon
 */
public class OpenSource implements Serializable {

    // internal
    public final boolean isLicenseText;
    private final String libraryName;
    private final String author;
    private String licenseText;
    private License license;
    // optional
    private String libraryVersion;
    private int year;


    public OpenSource(Builder builder) {
        this.libraryName = builder.libraryName;
        this.author = builder.author;
        this.license = builder.license;
        this.licenseText = builder.licenseText;
        this.libraryVersion = builder.libraryVersion;
        this.year = builder.year;

        isLicenseText = licenseText != null;
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

    public int getYear() {
        return year;
    }

    public String getVersion() {
        return libraryVersion;
    }

    public static class Builder{
        private String libraryName;
        private String author;
        private String licenseText;
        private License license;
        // optional
        private String libraryVersion;
        private int year;

        public Builder(final String libraryName, final String author, final String licenseText) {
            this.libraryName = libraryName;
            this.author = author;
            this.licenseText = licenseText;
        }

        public Builder(final String libraryName, final String author, final License license) {
            this.libraryName = libraryName;
            this.author = author;
            this.license = license;
        }

        public Builder withVersion(final String libraryVersion) {
            this.libraryName = libraryVersion;
            return this;
        }

        public Builder withYear(final int year) {
            this.year = year;
            return this;
        }

        public OpenSource build() {
            return new OpenSource(this);
        }

    }

}
