package com.raychenon.licensedroid.license;

/**
 * Created by Raymond Chenon
 */
public enum License {

    APACHE_2(new Apache_2_0()),
    MIT(new MIT());

    private OpenSourceLicense value;

    License(final OpenSourceLicense value) {
        this.value = value;
    }

    public OpenSourceLicense getValue() {
        return value;
    }
}