package com.raychenon.licensedroid.util;

import android.text.SpannableString;
import android.text.style.UnderlineSpan;

import java.text.MessageFormat;

/**
 * @author Raymond Chenon
 */

public class TextUtil {

    private TextUtil(){}

    public static boolean hasHyperlink(final String url){
        return url!= null && (url.startsWith("http") || url.contains("www."));
    }

    // http://stackoverflow.com/questions/9852184/android-textview-hyperlink?rq=1
    public static String formatWithLink(final String text,final String url ){
        return MessageFormat.format("<string><a href=\"{0}\">{1}</a></string>",url,text);
    }

    // http://stackoverflow.com/questions/2394935/can-i-underline-text-in-an-android-layout
    public static SpannableString underlineAndLink(final String text, final String url ){
        SpannableString content = new SpannableString(formatWithLink(text,url));
        content.setSpan(new UnderlineSpan(), 0, content.length(), 0);
        return content;
    }
}
