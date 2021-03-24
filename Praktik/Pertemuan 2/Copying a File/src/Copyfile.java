// ****************************************************************
// Copyfile
//
// Opening file, check wether file exist or not, and print the file.
//
// ****************************************************************

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Copyfile {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(System.in);
        boolean found = false; //Variable to validate the existence of the file

        while (!found) {
            System.out.print("File name: ");
            
            //Get file name
            String fileName = scan.nextLine();
            
            try {
                //Create new File object with path and file name as the parameter
                File myFile = new File("F:\\Tugas\\Semester 4\\APPL\\Praktik\\Pertemuan 2\\Copying a File\\filetest\\" + fileName);

                //If file doesn't exist, throw exception
                if (!myFile.exists()) {
                    throw new FileNotFoundException("File not found!");
                }

                //File exist, start to print the file
                Scanner readFile = new Scanner(myFile);
                
                while (readFile.hasNextLine()) {
                    
                    //Get the line
                    String line = readFile.nextLine();
                    
                    //Print the line
                    System.out.println(line);
                }
                
                //If file exist and printable, stop the loop
                found = true;
            } 
            catch (FileNotFoundException e) {
                
                //Print exception message
                System.err.println(e.getMessage());
            }

        }

    }
}
