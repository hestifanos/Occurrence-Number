package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        char[] chars = {'a','b','c','d','a','b','c','d','a','e','c','f'};
        Occurrence occurrence=new Occurrence();
    int appearance= occurrence.occurrenceNumber(chars,'b');
        System.out.println(appearance);
    }
}