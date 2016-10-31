package cz.vsb.p4.testapp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by ruz76 on 31.10.2016.
 */
public class Imposm {
    public void importToDb() throws IOException {
        Process process = new ProcessBuilder("NET", "HELP").start();
        InputStream is = process.getInputStream();
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);
        String line;

        System.out.printf("Output of running  process is:");

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
    }
}
