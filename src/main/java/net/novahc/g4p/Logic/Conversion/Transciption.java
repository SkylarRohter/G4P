package net.novahc.g4p.Logic.Conversion;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author skylarrohter
 */
public class Transciption {
    public Transciption(){
    }
    //private ArrayList<char[]> DNA = new ArrayList<>();

    public ArrayList<char[]> getRNA() {
        return RNA;
    }

    private ArrayList<char[]> RNA = new ArrayList<>();

    public void transcript(ArrayList<char[]> DNA){
        RNA = DNA;
        for(char[] codon : RNA) {
            for(int i = 0; i < codon.length;i++){
                if(codon[i] == 'T'){
                    codon[i] = 'U';
                }
            }
        }
//        for(char[] codon : RNA){
//            System.out.println(Arrays.toString(codon));
//        }
    }
}
