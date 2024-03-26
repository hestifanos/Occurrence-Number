package org.example;

public class Occurrence {

    public int occurrenceNumber(char[] chars, char target){

        int appearance = 0;
        for(char c: chars){
            if(c==target)
                appearance++;
        }

        return appearance;
    }
}
