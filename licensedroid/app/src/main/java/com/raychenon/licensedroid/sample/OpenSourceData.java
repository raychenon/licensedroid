package com.raychenon.licensedroid.sample;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.license.License;

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
        list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", License.APACHE_2).withYear(2013).build());
        list.add(new OpenSource.Builder("ViewPagerIndicator", "Jake Wharton",  License.MIT).build());
        list.add(new OpenSource.Builder("Retrofit", "Square, Inc",  License.APACHE_2).withYear(2013).build());
        list.add(new OpenSource.Builder("Picasso", "Square, Inc",  License.APACHE_2).withYear(2013).build());
        list.add(new OpenSource.Builder("Moshi", "Square, Inc",  License.APACHE_2).withYear(2015).build());
        list.add(new OpenSource.Builder("Flow", "Square, Inc",  License.APACHE_2).withYear(2013).build());

        // add more
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);

        return list;
    }
}
