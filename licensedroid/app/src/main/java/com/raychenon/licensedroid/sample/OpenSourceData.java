package com.raychenon.licensedroid.sample;

import com.raychenon.licensedroid.OpenSource;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raymond Chenon
 */
public class OpenSourceData {

    public static List<OpenSource> getData(){
        List<OpenSource> list = new LinkedList<>();
        list.add(new OpenSource("Butterknife", "Jake Wharton", "pache License, Version 2.0"));
        list.add(new OpenSource("ViewPagerIndicator", "Jake Wharton", "pache License, Version 2.0"));

        // add more
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);
        list.addAll(list);

        return list;
    }
}
