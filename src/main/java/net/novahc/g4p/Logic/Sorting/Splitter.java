package net.novahc.g4p.Logic.Sorting;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author skylarrohter
 */
public class Splitter {
    public Splitter(String sequence, int index, int stop){
        this.sequence = sequence;
        this.index = index;
        this.stop = stop;
    }
    public ArrayList<char[]> getSplit() {
        return DNA;
    }
    private int index;
    public static int stop;
    private ArrayList<char[]> DNA = new ArrayList<>();
    private String sequence;
    public final int codonSize = 3;

    public void split(){
        System.out.println("A "+index);
        System.out.println("X: " + stop);
        char[] charArr = sequence.toCharArray();
        for(int i = index+2; i < stop; i+=3){
           char[] c = new char[]{charArr[i-2],charArr[i-1],charArr[i]};
            System.out.println(Arrays.toString(c));
           DNA.add(c);
        }
    }
}
