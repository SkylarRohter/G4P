package net.novahc.g4p.Logic.Conversion;

public class FindCodon {
    public FindCodon(String codon, String sequence){
        this.codon = codon;
        this.sequence = sequence;
    }
    private String codon;
    private String sequence;

    public int find(){
        int index = 0;
        char[] SeqArr = sequence.toCharArray(), SplitCodon = codon.toCharArray();
        for(int i = 0; i < SeqArr.length; i++){
            try {
                if (SeqArr[i] == SplitCodon[0]) {
                    if (SeqArr[i + 1] == SplitCodon[1]) {
                        if (SeqArr[i + 2] == SplitCodon[2]) {
                            return i;
                        }
                    }
                }
            } catch(IndexOutOfBoundsException ie){
                System.out.println("Out of bounds");
                break;
            }
        }
        return index;
    }
    public int getStopIndex(){
        int index = 0;
        //TAA TAG TGA
        //
        char[] SeqArr = sequence.toCharArray();
        for(int i = find(); i < SeqArr.length; i++){
            try {
                if (SeqArr[i] == 'T') {
                    if (SeqArr[i + 1] == 'A') {
                        if ((SeqArr[i + 2] == 'A') || (SeqArr[i + 2] == 'G')) {
                            return i;
                        }
                    } else if(SeqArr[i + 1] == 'G'){
                        if (SeqArr[i + 2] == 'A') {
                            return i;
                        }
                    }
                }
            } catch(IndexOutOfBoundsException ie){
                System.out.println("Out of bounds");
                break;
            }
        }
        return index;
    }
}
