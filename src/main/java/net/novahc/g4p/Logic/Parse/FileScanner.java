package net.novahc.g4p.Logic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author skylarrohter
 */
public class FileScanner {
    private String path;
    public FileScanner(String path){
        this.path = path;
        //Always call save() method at the instantiation of the class
        try {
            save();
        } catch(FileNotFoundException fnfe){
            fnfe.printStackTrace();
        }
    }

    public String getSequence() {
        return sequence;
    }

    private String sequence;


    //Brings the file into the IDE.
    //Reads each character, then adds it to a string (oneLine). String is converted to "sequence" String.
    public void save() throws FileNotFoundException {
        Scanner fileReader = new Scanner(new File(path));
        String oneLine = "";
        while(fileReader.hasNext()){
            oneLine += fileReader.next();
        }
        sequence = oneLine;
    }
}
