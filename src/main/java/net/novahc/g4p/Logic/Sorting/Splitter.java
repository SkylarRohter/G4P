package net.novahc.g4p.Logic.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author skylarrohter
 */
public class Splitter {
    public Splitter(String sequence){
        this.sequence = sequence;
    }
    public ArrayList<char[]> getSplit() {
        return DNA;
    }
    private ArrayList<char[]> DNA = new ArrayList<>();
    private String sequence;
    public final int codonSize = 3;

    public void split(){
        char[] charArr = sequence.toCharArray();
        for(int i = 2; i < charArr.length; i+=3){
           char[] c = new char[]{charArr[i-2],charArr[i-1],charArr[i]};
            //System.out.println(Arrays.toString(c));
           DNA.add(c);
        }
    }
}
