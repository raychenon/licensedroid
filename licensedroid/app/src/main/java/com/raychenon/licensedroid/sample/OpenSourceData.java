package com.raychenon.licensedroid.sample;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.license.MapLicense;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Raymond Chenon
 */
public class OpenSourceData {

    public static List<OpenSource> getData(){
        List<OpenSource> list = new LinkedList<>();

        list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", "Apache License, Version 2.0").build());
        list.add(new OpenSource.Builder("ViewPagerIndicator", "Jake Wharton", "Apache License, Version 2.0").build());
        // add more
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);

        return list;
    }

    public static List<OpenSource> getLicenseData(){
        List<OpenSource> list = new LinkedList<>();
        list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", MapLicense.APACHE2(2013)).build());
        list.add(new OpenSource.Builder("ViewPagerIndicator", "Jake Wharton", MapLicense.MIT(2013)).build());
        list.add(new OpenSource.Builder("Retrofit", "Square, Inc",  MapLicense.APACHE2(2013)).build());
        list.add(new OpenSource.Builder("Picasso", "Square, Inc",  MapLicense.APACHE2(2013)).build());
        list.add(new OpenSource.Builder("Moshi", "Square, Inc",  MapLicense.APACHE2(2015)).build());
        list.add(new OpenSource.Builder("Flow", "Square, Inc",  MapLicense.APACHE2(2013)).build());
        list.add(new OpenSource.Builder("Advanced RecyclerView", "Haruki Hasegawa", MapLicense.APACHE2(2015)).build());
        list.add(new OpenSource.Builder("Expandable RecyclerView", "Big Nerd Ranch", MapLicense.MIT(2015)).build());

        list.add(new OpenSource.Builder("facebook-android-sdk", "Facebook, Inc",  "You are hereby granted a non-exclusive, worldwide, royalty-free license to use,\n" +
                "copy, modify, and distribute this software in source code or binary form for use\n" +
                "in connection with the web services and APIs provided by Facebook.\n" +
                "\n" +
                "As with any software that integrates with the Facebook platform, your use of\n" +
                "this software is subject to the Facebook Developer Principles and Policies\n" +
                "[http://developers.facebook.com/policy/]. This copyright notice shall be\n" +
                "included in all copies or substantial portions of the software.\n" +
                "\n" +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS\n" +
                "FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR\n" +
                "COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER\n" +
                "IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN\n" +
                "CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.").build());

        // add more
        list.addAll(list);

        return list;
    }
}
