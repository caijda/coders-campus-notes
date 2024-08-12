package com.coderscampus.lesson1.ifPresentPractice;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SuspectApplication {
    public static void main(String[] args) throws IOException {
        FileService file = new FileService();
        List<SuspectLocation> suspects = new ArrayList<>();

        file.readFile(suspects);
        // file.readFile(suspects, "InterpolWatchReport-Week2.csv");
        // file.readFile(suspects, "InterpolWatchReport-Week3.csv");
    }
}
