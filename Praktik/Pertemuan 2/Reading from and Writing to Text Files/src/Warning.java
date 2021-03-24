// ****************************************************************************
// Warning.java
//
// Reads student data from a text file and writes data to another text file.
// ****************************************************************************

import java.util.Scanner;
import java.io.*;

public class Warning {
// --------------------------------------------------------------------
// Reads student data (name, semester hours, quality points) from a
// text file, computes the GPA, then writes data to another file
// if the student is placed on academic warning.
// --------------------------------------------------------------------

    public static void main(String[] args) {
        int creditHrs; // number of semester hours earned
        double qualityPts; // number of quality points earned
        double gpa; // grade point (quality point) average
        String line, name, inputName = "students.dat";
        String outputName = "warning.dat";
        String path = "F:\\Tugas\\Semester 4\\APPL\\Praktik\\Pertemuan 2\\Reading from and Writing to Text Files\\file test\\"; //Folder path
        try {
            // Set up scanner to input file
//        BufferedReader br = new BufferedReader(new FileReader(path + inputName));
            File inFile = new File(path + inputName);
            Scanner scan = new Scanner(inFile);

            // Set up the output file stream
            PrintWriter outFile = new PrintWriter(outputName);
//        FileWriter fw = new FileWriter(path + outputName);

            // Print a header to the output file
            outFile.println();
            outFile.println("Students on Academic Warning");
            outFile.println();
            // Process the input file, one token at a time
            while (scan.hasNext()) {
                line = scan.nextLine();
                System.out.println(line);

                // Get the credit hours and quality points and
                String[] split = line.split(" ");
                name = split[0];
                creditHrs = Integer.parseInt(split[1]);
                qualityPts = Double.parseDouble(split[2]);
                gpa = qualityPts / creditHrs;

                // determine if the student is on warning. If so,
                // write the student data to the output file.
                if (creditHrs < 30) {
                    if (gpa < 1.5) {
                        outFile.write(name + " " + creditHrs + " " + gpa);
                    }
                } else if (creditHrs < 60) {
                    if (gpa < 1.75) {
                        outFile.write(name + " " + creditHrs + " " + gpa);
                    }
                } else {
                    if (gpa < 2.0) {
                        outFile.write(name + " " + creditHrs + " " + gpa);
                    }
                }

            }
// Close output file
        } catch (FileNotFoundException exception) {
            System.out.println("The file " + inputName + " was not found.");
        } catch (IOException exception) {
            System.out.println(exception);
        } catch (NumberFormatException e) {
            System.out.println("Format error in input file: " + e);
        }
    }
}
