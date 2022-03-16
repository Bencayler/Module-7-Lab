package edu.sdccd.cisc191;

import java.io.*;
import java.util.stream.StreamSupport;

/**
 *
 * References:
 * Morelli, R., & Walde, R. (2016). Java, Java, Java: Object-Oriented Problem Solving.
 * Retrieved from https://open.umn.edu/opentextbooks/textbooks/java-java-java-object-oriented-problem-solving
 *
 */
public class IOLab
{
    public static void main(String[] args) {
        System.out.println("Hello World");
        // System.out.println(readTestResults("src/main/resources/TestResults.csv"));
        readTestResults("src/main/resources/TestResults.csv");
        appendTestResult("src/main/resources/NewTestResults.csv", "Julie, Brown; Fuck you");
        appendTestResult("src/main/resources/NewTestResults.csv", "Valteri, it's James.");

        readTestResults("src/main/resources/NewTestResults.csv");
        // readTestResults("Users//benjamincayler//IdeaProjects//Module-7-Lab//src//main//resources//TestResults.csv");
    }

    public static String readTestResults(String s) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(s));
            String test;
            String accumulator = "";
            while ((test = br.readLine()) != null) {
                accumulator += test;
            }
            br.close();
            System.out.println(accumulator);
            return accumulator;
        } catch (Exception ex) {
            return "";
        }
    }

    public static void appendTestResult(String s, String s1) {
        try {
            BufferedWriter bw = new BufferedWriter( new FileWriter(s, true));
            bw.write(s1);
            bw.close();

        } catch (Exception ex) {
            return;
        }

    }

    public static String readDateTime(String s) {
        return "";
    }
}