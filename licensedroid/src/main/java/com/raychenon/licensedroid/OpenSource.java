package com.raychenon.licensedroid;

import android.os.Parcel;
import android.os.Parcelable;

import com.raychenon.licensedroid.license.LicenseInfos;

/**
 * @author Raymond Chenon
 */
public class OpenSource implements Parcelable {

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<OpenSource> CREATOR = new Parcelable.Creator<OpenSource>() {
        @Override
        public OpenSource createFromParcel(Parcel in) {
            return new OpenSource(in);
        }

        @Override
        public OpenSource[] newArray(int size) {
            return new OpenSource[size];
        }
    };
    // internal
    public final boolean isLicenseText;
    private final String libraryName;
    private final String author;
    private String licenseText;
    private LicenseInfos license;
    // optional
    private String libraryVersion;
    private String gitRepoUrl;

    public OpenSource(Builder builder) {
        this.libraryName = builder.libraryName;
        this.author = builder.author;
        this.license = builder.license;
        this.licenseText = builder.licenseText;
        this.libraryVersion = builder.libraryVersion;
        this.gitRepoUrl = builder.gitRepoUrl;

        isLicenseText = licenseText != null;
    }

    protected OpenSource(Parcel in) {
        isLicenseText = in.readByte() != 0x00;
        libraryName = in.readString();
        author = in.readString();
        licenseText = in.readString();
        license = (LicenseInfos) in.readSerializable();
        libraryVersion = in.readString();
        gitRepoUrl = in.readString();
    }

    public String getProjectName() {
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

    public String getGitRepoUrl(){
        return gitRepoUrl;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeByte((byte) (isLicenseText ? 0x01 : 0x00));
        dest.writeString(libraryName);
        dest.writeString(author);
        dest.writeString(licenseText);
        dest.writeSerializable(license);
        dest.writeString(libraryVersion);
        dest.writeString(gitRepoUrl);
    }

    public static class Builder {
        private String libraryName;
        private String author;
        private String licenseText;
        private LicenseInfos license;
        // optional
        private String libraryVersion;
        private String gitRepoUrl;

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
            this.libraryVersion = libraryVersion;
            return this;
        }

        public Builder withGitRepoUrl(final String gitRepoUrl){
            this.gitRepoUrl = gitRepoUrl;
            return this;
        }

        public OpenSource build() {
            return new OpenSource(this);
        }

    }
}
