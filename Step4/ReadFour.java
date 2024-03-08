package Step4;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class ReadFour {
    /**
     * Yes, you can look at the other
     * examples in this lab to build your solution here.
     */
    public static void main(String[] args) {
        try {
            File startingPath = new File(System.getProperty("user.dir"));
            Scanner fileIn = new Scanner(new File(startingPath, "/Step4/input.txt"));
            int fileCounter = 1;
            int sum = 0;
            while (fileIn.hasNext()) {
                // Reads the entire line as a string
                String lineIn = fileIn.nextLine();
                sum = sum + Integer.parseInt(lineIn);
                File Fileright = new File("/Users/shaily/Projects/SM_FileIOJava/Step4/output" + fileCounter + ".txt");
                PrintWriter fileOut = new PrintWriter(Fileright);
                fileOut.println("Running total = " + sum);
                fileCounter++;
                // Close out file
                fileOut.close();
            }
            // Print out a running total of all the
            // values in the input file.
        } catch (IOException e) {
            System.out.println("File not found");
        }
    }
}