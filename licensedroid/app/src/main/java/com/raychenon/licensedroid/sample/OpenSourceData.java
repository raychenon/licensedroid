package com.raychenon.licensedroid.sample;

import com.raychenon.licensedroid.OpenSource;
import com.raychenon.licensedroid.license.License;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raymond Chenon
 */
public class OpenSourceData {

    public static List<OpenSource> getData(){
        List<OpenSource> list = new LinkedList<>();
        list.add(new OpenSource("Butterknife", "Jake Wharton", "Apache License, Version 2.0"));
        list.add(new OpenSource("ViewPagerIndicator", "Jake Wharton", "Apache License, Version 2.0"));

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
        list.add(new OpenSource("Butterknife", "Jake Wharton", License.APACHE_2));
        list.add(new OpenSource("ViewPagerIndicator", "Jake Wharton",  License.MIT));

        // add more
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);

        return list;
    }
}
