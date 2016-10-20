package cz.vsb.p4.testapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by ruz76 on 20.10.2016.
 */
public class Downloader extends Thread {
    public void run() {
        /* while(true) { */
        //TODO
            URL website = null;
            try {
                website = new URL("http://download.geofabrik.de/europe/malta-latest.osm.pbf");
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
            ReadableByteChannel rbc = null;
            try {
                rbc = Channels.newChannel(website.openStream());
                long milis = System.currentTimeMillis();
                FileOutputStream fos = new FileOutputStream(milis + "-malta-latest.osm.pbf");
                fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
            } catch (IOException e) {
                e.printStackTrace();
            }
            /*
            try {
            Thread.sleep(1000 * 60 * 60 * 24 * 30);
            } catch (InterruptedException e) {
            e.printStackTrace();
            }
            }
            */
    }
}
