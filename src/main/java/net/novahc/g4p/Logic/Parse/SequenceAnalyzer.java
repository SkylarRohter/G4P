package net.novahc.g4p.Logic.Parse;

import java.text.DecimalFormat;

/**
 * @author skylarrohter
 */
public class SequenceAnalyzer {

    private String sequence;
    public SequenceAnalyzer(String sequence){
        this.sequence = sequence;
    }
    //Splits string into char array, then each char is compared within a if statement
    //Values are added up and returned in an integer array
    //TAC TCG TCG CAG TCT TGA
    //AGC AGC GTC AGA
    public int[] getBPCounts(){
        char[] seq = sequence.toUpperCase().toCharArray();
        int A = 0,C = 0,T = 0,G = 0;
        for(char bp : seq){
            if(bp == 'A'){
                A++;
            } else if(bp == 'C'){
                C++;
            } else if(bp == 'T'){
                T++;
            } else if(bp == 'G'){
                G++;
            }
        }
        return new int[]{A,C,T,G};
    }
    //Takes split array from getBPCounts() method, then divdes them by sequence length to get %
    public double[] getBPPercentages(){
        int[] counts = getBPCounts();
        double[] percentages = new double[4];
        int length = sequence.length();
        for(int i = 0; i < counts.length; i++){
            double per = counts[i]/(double)sequence.length();
            DecimalFormat df = new DecimalFormat("###.####");
            percentages[i] = Double.parseDouble(df.format(per));
        }
        return percentages;
    }
}
