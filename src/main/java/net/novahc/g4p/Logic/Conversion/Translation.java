package net.novahc.g4p.Logic.Conversion;

import java.util.ArrayList;

/**
 * @author skylarrohter
 */
public class Translation {
    public Translation(ArrayList<char[]> RNA){
        this.RNA = RNA;
        translate();
        System.out.println(AA);
    }
    private ArrayList<char[]> RNA;
    private ArrayList<String> AA = new ArrayList<>();

    public void translate(){
        for(char[] codon : RNA) {
            AA.add(compare(codon));
        }
    }
    public String compare(char[] rna){
        String codon = "";
        if(rna[0] == 'A'){
            codon+="A";
            if(rna[1] == 'A'){
                codon+="A";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "lys";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "asn";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "asn";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "lys";
                }
            }
            else if(rna[1] == 'C'){
                codon+="C";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "thr";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "thr";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "thr";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "thr";
                }
            }
            else if(rna[1] == 'U'){
                codon+="U";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "lle";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "lle";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "lle";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "met";
                }
            }
            else if(rna[1] == 'G'){
                codon+="G";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "arg";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "ser";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "ser";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "arg";
                }
            }
        }

        else if(rna[0] == 'C'){
            codon+="C";
            if(rna[1] == 'A'){
                codon+="A";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "gln";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "his";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "his";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "gln";
                }
            }
            else if(rna[1] == 'C'){
                codon+="C";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "pro";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "pro";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "pro";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "pro";
                }
            }
            else if(rna[1] == 'U'){
                codon+="U";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "leu";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "leu";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "leu";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "leu";
                }
            }
            else if(rna[1] == 'G'){
                codon+="G";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "arg";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "arg";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "arg";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "arg";
                }
            }
        }

        else if(rna[0] == 'U'){
            codon+="U";
            if(rna[1] == 'A'){
                codon+="A";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "stp";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "tyr";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "tyr";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "stp";
                }
            }
            else if(rna[1] == 'C'){
                codon+="C";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "ser";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "ser";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "ser";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "ser";
                }
            }
            else if(rna[1] == 'U'){
                codon+="U";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "leu";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "phe";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "phe";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "leu";
                }
            }
            else if(rna[1] == 'G'){
                codon+="G";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "stp";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "cys";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "cys";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "trp";
                }
            }
        }

        else if(rna[0] == 'G'){
            codon+="G";
            if(rna[1] == 'A'){
                codon+="A";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "glu";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "asp";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "asp";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "glu";
                }
            }
            else if(rna[1] == 'C'){
                codon+="C";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "ala";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "ala";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "ala";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "ala";
                }
            }
            else if(rna[1] == 'U'){
                codon+="U";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "val";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "val";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "val";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "val";
                }
            }
            else if(rna[1] == 'G'){
                codon+="G";
                if(rna[2] == 'A'){
                    codon+="A";
                    return "gly";
                }
                else if(rna[2] == 'C'){
                    codon+="C";
                    return "gly";
                }
                else if(rna[2] == 'U'){
                    codon+="U";
                    return "gly";
                }
                else if(rna[2] == 'G'){
                    codon+="G";
                    return "gly";
                }
            }
        }
        return "Error";
    }
    private String evaluate(String codon){
        String aminoAcid = "";
        return aminoAcid;
    }
}
