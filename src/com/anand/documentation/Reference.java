package com.anand.documentation;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class Reference {
    public static void main(String[] args) throws IOException {
        //read a web page into a string
        //see http://stackoverflow.com/questions/4328711/read-url-to-string-in-few-lines-of-java-code
        String out = new Scanner(new URL("https://www.mit.edu/").openStream(), "UTF-8").useDelimiter("\\A").next();
        System.out.println(out);
    }
}