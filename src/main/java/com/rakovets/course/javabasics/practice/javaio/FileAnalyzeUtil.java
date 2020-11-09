package com.rakovets.course.javabasics.practice.javaio;

import java.io.*;
import java.util.List;

public class FileAnalyzeUtil {

    public List<String> getLengthOfString(String pathFile) throws FileNotFoundException {
       File file = new File(pathFile);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
        return line;
    }
}
