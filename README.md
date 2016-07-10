License Droid
============

Avoid boiler plate code to display one page "open source". 
* Write the list of libraries in a few lines
* 


```java
// data
List<OpenSource> list = new ArrayList<>();
list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", LicenseMap.APACHE2(2013)).build());
list.add(new OpenSource.Builder("ViewPagerIndicator", "Jake Wharton", LicenseMap.MIT(2013)).build());
....
// display
OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(list);
dialog.show(getSupportFragmentManager(), "dialog");
```

Field and method binding for Android views which uses annotation processing to generate boilerplate
code for you.

 * Eliminate `findViewById` calls by using `@BindView` on fields.
 * Group multiple views in a list or array. Operate on all of them at once with actions,d

https://raw.githubusercontent.com/JakeWharton/butterknife/master/README.md
https://github.com/JakeWharton/butterknife