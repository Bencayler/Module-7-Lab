package edu.sdccd.cisc191;

import java.io.*;
import java.net.*;
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
        readTestResults("src/main/resources/TestResults.csv");
        appendTestResult("src/main/resources/NewTestResults.csv", "Woooorking thank you");
        readTestResults("src/main/resources/NewTestResults.csv");
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
        try {
            URL url = new URL("http://worldtimeapi.org/api/ip");
            BufferedReader input = new BufferedReader(new InputStreamReader(url.openStream()));
            String accumulator = "";
            String test;
            accumulator = input.readLine();
//            while ((test = input.readLine()) != null) {
//                accumulator += test;
//            }

            System.out.println(accumulator);
            input.close();
            return accumulator;
        }
        catch (Exception ex) {
            System.out.println("ERROR");
            return "";
        }
    }
}