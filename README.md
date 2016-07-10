License Droid
============

Avoid boiler plate code to display one page "open source". 
* Write the list of libraries in a few lines
* Select the license type with `LicenseMap`


```java
// constuct the data
List<OpenSource> list = new ArrayList<>();
list.add(new OpenSource.Builder("Butterknife", "Jake Wharton", LicenseMap.APACHE2(2013)).build());
// add a special license
list.add(new OpenSource.Builder("Expandable RecyclerView", "Big Nerd Ranch", LicenseMap.MIT(2015)).build());
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

....
// display
OpenSourceDialogFragment dialog = OpenSourceDialogFragment.newInstance(arraylist);
dialog.show(getSupportFragmentManager(), "dialog");
```