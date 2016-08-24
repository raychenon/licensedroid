License Droid
============

![Alt text](/images/preview_licensedroid.png "Preview")

Avoid boiler plate code to display one page "open source". 
* Write the list of libraries in a few lines
* Select the license type with `LicenseMap`
* display the licences with `OpenSourceDialogFragment` or `OpenSourceAdapter` 


```java
// constuct the data
List<OpenSource> list = new ArrayList<>();
list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", LicenseMap.APACHE2(2013)).build());
list.add(new OpenSource.Builder("Expandable RecyclerView", "Big Nerd Ranch", LicenseMap.MIT(2015)).build());
// add a special license
list.add(new OpenSource.Builder("facebook-android-sdk", "Facebook, Inc",  "You are hereby granted a non-exclusive, worldwide, royalty-free license to ...").build());

....


// display
OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(list);
dialog.show(getSupportFragmentManager(), "dialog");
```

Library Project
============
To use License Droid as a library, configure the project level `build.gradle` then add LicenseDroid :
```groovy
buildscript {
  repositories {
    jcenter()
    // add this repo if jcenter doesn't work
    // maven { url 'https://dl.bintray.com/raychenon/maven' }
   }
}

dependencies {
    compile 'com.raychenon:licensedroid:0.1.0'
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