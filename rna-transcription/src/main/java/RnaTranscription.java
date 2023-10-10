class RnaTranscription {

    String transcribe(String dnaStrand) {
       
        StringBuilder rnaStrand = new StringBuilder();
        for(int i=0;i<dnaStrand.length();i++){
            if(dnaStrand.charAt(i)=='G'){
                rnaStrand.append('C');
            }
            else if(dnaStrand.charAt(i)=='T'){
                rnaStrand.append('A');
            }
            else if(dnaStrand.charAt(i)=='A'){
                rnaStrand.append('U');
            }
            else if(dnaStrand.charAt(i)=='C'){
                rnaStrand.append('G');
            }
            else
            {
                throw new IllegalArgumentException("Dna Strand Not Found");
            }
        }
        return rnaStrand.toString();
    }

}
