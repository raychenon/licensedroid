License Droid
============

[![Apache 2](https://img.shields.io/badge/license-Apache2-blue.svg?style=flat)](https://raw.githubusercontent.com/raychenon/licensedroid/master/LICENSE.txt)
![Build Status - Master](https://travis-ci.org/raychenon/licensedroid.svg?branch=master)
[![Download](https://api.bintray.com/packages/raychenon/maven/com.raychenon%3Alicensedroid/images/download.svg) ](https://bintray.com/raychenon/maven/com.raychenon%3Alicensedroid/_latestVersion)

**An elegant library to credit the open source projects used in a commercial app**

![Alt text](/images/preview_licensedroid.png "Preview")

## Summary

Avoid boiler plate code to display one page "open source". 
* Avoid copy-paste of license text. Write the list of libraries in a few lines.
* Display the licenses

## Getting Started

First let's construct the data. Select the license type with `LicenseMap`
```java
// construct the data
List<OpenSource> list = new ArrayList<>();
list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", LicenseMap.APACHE2(2013)).build());
list.add(new OpenSource.Builder("Expandable RecyclerView", "Big Nerd Ranch", LicenseMap.MIT(2015)).build());
// add a custom license
list.add(new OpenSource.Builder("facebook-android-sdk", "Facebook, Inc",  "You are hereby granted a non-exclusive, worldwide, royalty-free license to ...").build());
```

Display the licences with `OpenSourceDialogFragment` or `OpenSourceAdapter` 
```java
//  display in a Dialog
OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(list);
dialog.show(getSupportFragmentManager(), "dialog");

//  use a turnkey RecyclerView Adapter
OpenSourceAdapter adapter = new OpenSourceAdapter(list);
recyclerView.setAdapter(adapter);
```

Bored that all the licenses page look the same? You can create own custom viewholder.
`OpenSourceAdapter` accepts an `OpenSourceViewHolder.Factory` in its constructor.
The custom View Holder extends from `OpenSourceViewHolder`. It must have a static `Factory` class.
```java
OpenSourceAdapter adapter = new OpenSourceAdapter(OpenSourceData.getLicenseData(), new MyCustomViewHolder.Factory());
...
public class MyCustomViewHolder extends OpenSourceViewHolder {
    public static class Factory implements OpenSourceViewHolder.Factory {
        @Override
        public OpenSourceViewHolder createViewHolder(ViewGroup parent, int viewType){
            // this is where you inflate the layout
            View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.any_layout, parent, false);
            return new CustomViewHolder(v);
        }
    };

    public MyCustomViewHolder(View itemView) {
        super(itemView);
    }

    @Override
    public void bindData(OpenSourceUIModel item) {
        // bind your view holder with data
    }
}
```
 
Add a new License
=================
You need a License missing in ```LicenseMap```.
You can create a new License by extending ```LicenseInfos```
```
public class CustomLicense extends LicenseInfos 
```

Library Project
============
To use License Droid as a library, configure the project level `build.gradle`, add jcenter as repository then add LicenseDroid :
```groovy
buildscript {
  repositories {
    jcenter()
  }
}

dependencies {
    compile 'com.raychenon:licensedroid:0.3.1'
}
```

Note: you may encounter ['tools:replace' issue][1] in the `AndroidManifest.xml` .
To fix it, make these changes.

```xml
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"  <!--add this line-->
    
<application
    tools:replace="icon,label" <!--add this line-->
```
## Credits

The arrow up icon was designed by Denis Mikhutin
https://www.iconfinder.com/icons/1031534


License
-------

    Copyright 2016 Raymond Chenon

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
    
    
 [1]: http://stackoverflow.com/questions/25981156/tools-replace-not-replacing-in-android-manifest 