package com.galvanize;

class ZipCodeProcessor {
    String process(String s) {
        Verifier verifier = new Verifier();
        try {
            verifier.verify(s);
        } catch (InvalidFormatException e) {
            return "The zip code you entered was the wrong length.";
        } catch (NoServiceException e) {
            return "We're sorry, but the zip code you entered is out of our range.";
        } catch (Exception ignored) {

        }
        return "Thank you!  Your package will arrive soon.";
    }
}
