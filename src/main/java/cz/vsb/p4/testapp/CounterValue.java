package cz.vsb.p4.testapp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;

/**
 * Created by trehak on 10.10.2016.
 */
public class CounterValue {

    private final String key;
    private final Long value;


    public CounterValue(String key, Long value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        //TODO
        Downloader d = new Downloader();
        d.start();
        return key;
    }

    public Long getValue() {
        return value;
    }

}
