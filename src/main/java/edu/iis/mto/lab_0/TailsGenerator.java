package edu.iis.mto.lab_0;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class TailsGenerator {

    public List<String> tails(String value) {

        if(value == null){
            return Collections.emptyList();
        }
        List<String> listOfReturnedStrings = new ArrayList<>();

        for(int i=0; i<value.length(); i++){
            String temp = value.substring(i, value.length());
            listOfReturnedStrings.add(temp);
        }

        listOfReturnedStrings.add("");

        return listOfReturnedStrings;




    }


}
