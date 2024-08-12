package com.coderscampus.lesson1.ifPresentPractice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Optional;

public class FileService {
    
    public void readFile (List<SuspectLocation> suspects) throws FileNotFoundException, IOException{
        try(BufferedReader reader = new BufferedReader(new FileReader("InterpolWatchReport-Week1.csv"))){
			reader.readLine();
            String line;
            while((line = reader.readLine()) != null){
                String[] suspect = line.split(",");
                suspects.add(new SuspectLocation(suspect[0], suspect[1]));
            }
        }
        findSuspect(suspects, "CARMEN SANDIEGO");
        suspects.clear();
    }

    public void findSuspect (List<SuspectLocation> suspects, String suspectName){
        Optional<SuspectLocation> suspect = suspects.stream()
                                                    .filter(name -> name.getName().equals(suspectName))
                                                    .findAny();

        suspect.ifPresent(p -> System.out.println("Carmen Sandiego is in... " + p.getCountry()));
    }
}