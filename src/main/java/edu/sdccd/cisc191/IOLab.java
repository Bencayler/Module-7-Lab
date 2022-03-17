package edu.sdccd.cisc191;

import java.io.*;
import java.net.*;
import java.util.Scanner;

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
        // Hello World print statement to make sure we are running okay top to bottom.
        System.out.println("Hello World");
        readTestResults("src/main/resources/TestResults.csv");
        readTestResults("src/main/resources/NewTestResults.csv");
        readDateTime("http://worldtimeapi.org/api/ip");
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
            URL url = new URL(s);
            Scanner input = new Scanner(url.openStream());
            String test = "";
            int counter = 0;
            while (input.hasNext()) {
                test = input.nextLine();
                // System.out.println(input.nextLine());
                System.out.println("Working");
                counter += 1;
            }
            input.close();
            System.out.println(test);
            test = test.substring(327, 381);
            System.out.println(test);

            return test;
        }
        catch (Exception ex) {
            System.out.println("ERROR");
            return "";
        }
    }
}