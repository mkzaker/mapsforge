package org.mapsforge.map.android;

import android.app.Application;
import android.graphics.Typeface;
import org.mapsforge.map.android.graphics.AndroidGraphicFactory;

/**
 * Created by zaker on 2/3/15.
 */
public class MapApplication extends Application {

    private static Typeface typeface = Typeface.DEFAULT;

    public static Typeface getTypeface() {
        return typeface;
    }

    public void setTypeface(Typeface typeface) {
        MapApplication.typeface = typeface;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidGraphicFactory.createInstance(this);
    }
}
