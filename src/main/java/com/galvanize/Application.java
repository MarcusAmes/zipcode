package com.galvanize;

public class Application {
    public static void main(String[] args) {
        ZipCodeProcessor zipCodeProcessor = new ZipCodeProcessor();
        String result = zipCodeProcessor.process("22345");
        System.out.println(result);
    }
}
