package cine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno
 */
public final class RFileUtilitary {

    File file;
    BufferedReader bufferedReader;

    public RFileUtilitary(String filePathAndName) {
        FileReader fileReader;
        try {
            this.file = new File(filePathAndName);
            fileReader = new FileReader(file);
            this.bufferedReader = new BufferedReader(fileReader);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(RFileUtilitary.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getLine() {
        String line = null;
        try {
            line = bufferedReader.readLine();
        } catch (IOException ex) {
        	ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader == null) {
                    bufferedReader.close();
                }
            } catch (IOException ex) {
            	ex.printStackTrace();
            }
        }
        return line;
    }
}