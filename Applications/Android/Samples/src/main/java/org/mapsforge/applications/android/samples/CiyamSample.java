package org.mapsforge.applications.android.samples;

import org.mapsforge.map.android.rendertheme.AssetsRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderTheme;

import java.io.IOException;

/**
 * Created by zaker on 3/29/15.
 */
public class CiyamSample extends SamplesBaseActivity {
    @Override
    protected XmlRenderTheme getRenderTheme() {
        try {
            return new AssetsRenderTheme(this, "", "theme.xml");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected String getMapFileName() {
        return "mashhad.map";
    }

}
