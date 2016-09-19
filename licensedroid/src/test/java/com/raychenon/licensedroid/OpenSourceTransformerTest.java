package com.raychenon.licensedroid;

import com.raychenon.licensedroid.license.LicenseInfos;
import com.raychenon.licensedroid.license.LicenseMap;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * @author Raymond Chenon
 */

public class OpenSourceTransformerTest {
    final int YEAR = 2015;
    final String NAME = "name";
    final String AUTHOR = "author";

    OpenSourceTransformer openSourceTransformer;

    @Before
    public void init() {
        openSourceTransformer = new OpenSourceTransformer();
    }

    @Test
    public void transform_correct_when_apache2() throws Exception {
        LicenseInfos licenseInfos = LicenseMap.APACHE2(YEAR);

        OpenSourceModel model = openSourceTransformer.transform(mockOpenSource(licenseInfos));
        transform_correct_whatever_license(licenseInfos,model);
        assertEquals(licenseInfos.getLongerLicenseText(), model.license.fullDescription);
    }

    @Test
    public void transform_correct_when_mit() throws Exception {

        LicenseInfos licenseInfos = LicenseMap.MIT(YEAR);
        OpenSourceModel model = openSourceTransformer.transform(mockOpenSource(licenseInfos));
        transform_correct_whatever_license(licenseInfos,model);
    }

    @Test
    public void transform_correct_when_mozilla() throws Exception {
        LicenseInfos licenseInfos = LicenseMap.MOZILLA_PUBLIC_LICENSE();
        OpenSourceModel model = openSourceTransformer.transform(mockOpenSource(licenseInfos));
        transform_correct_whatever_license(licenseInfos, model);
    }

    public void transform_correct_whatever_license(final LicenseInfos licenseInfos, final OpenSourceModel model) throws Exception {
        assertEquals(AUTHOR, model.author);
        assertEquals(NAME, model.libraryName);
        assertEquals(licenseInfos.getName(), model.license.name);

        if (licenseInfos.hasLongerLicenseText()){
            assertNotNull(model.license.fullDescription);
        }else{
            assertEquals(licenseInfos.getLongerLicenseText(), model.license.fullDescription);
        }
        assertNotNull(model.license.text);
    }


    private OpenSource mockOpenSource(LicenseInfos licenseInfos) {
        OpenSource openSource = new OpenSource.Builder(NAME, AUTHOR, licenseInfos).build();
        return openSource;
    }
}
