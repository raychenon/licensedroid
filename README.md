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
To use License Droid as a library, add the repository to the module's build.gradle (not the parent):

```
repositories {
  maven { url 'https://dl.bintray.com/raychenon/maven' }
}

```

Then add this dependency
```
dependencies {
  compile 'com.raychenon:licensedroid:0.1.0'
}
```
