package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.License;
import com.raychenon.licensedroid.license.LicenseInfos;

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
    private LicenseInfos license;
    // optional
    private String libraryVersion;


    public OpenSource(Builder builder) {
        this.libraryName = builder.libraryName;
        this.author = builder.author;
        this.license = builder.license;
        this.licenseText = builder.licenseText;
        this.libraryVersion = builder.libraryVersion;

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

    public LicenseInfos getLicense() {
        return license;
    }

    public String getVersion() {
        return libraryVersion;
    }

    public static class Builder{
        private String libraryName;
        private String author;
        private String licenseText;
        private LicenseInfos license;
        // optional
        private String libraryVersion;

        public Builder(final String libraryName, final String author, final String licenseText) {
            this.libraryName = libraryName;
            this.author = author;
            this.licenseText = licenseText;
        }

        public Builder(final String libraryName, final String author, final LicenseInfos license) {
            this.libraryName = libraryName;
            this.author = author;
            this.license = license;
        }

        public Builder withVersion(final String libraryVersion) {
            this.libraryName = libraryVersion;
            return this;
        }

        public OpenSource build() {
            return new OpenSource(this);
        }

    }

}
