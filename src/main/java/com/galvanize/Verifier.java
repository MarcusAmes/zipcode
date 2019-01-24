package com.galvanize;

class Verifier {

    void verify(String s) throws Exception{
        if (s.length() < 5) {
            throw new InvalidFormatException("Zip code too short") ;
        } else if (s.length() > 5) {
            throw new InvalidFormatException("Zip code too long") ;
        }
        if(s.substring(0,1).equals("1")) {
            throw new NoServiceException("Zip code starting with 1 is not valid");
        }
    }
}
