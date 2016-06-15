package edu.galileo.android.tipcalc;

import android.app.Application;

/**
 * Created by Alvaro on 03-06-2016.
 */
public class TipCalcApp extends Application {
    private static String ABOUT_URL = "http://www.pynapple.cl";

    public String getAboutUrl(){
        return ABOUT_URL;
    }
}
