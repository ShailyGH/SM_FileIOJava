package Step3;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadThree
{
    public static void main(String[] args)
    {
        try{
            File starting = new File(System.getProperty("user.dir"));
            System.out.print("Writing to file ... ");
            // Create the file to write to
            File Fileright = new File("/Users/shaily/Projects/SM_FileIOJava/Step3/output.txt");
            PrintWriter fileOut = new PrintWriter(Fileright);
            // Write text just like we would to the console
            fileOut.println("Hello ");
            // Clode out file
            fileOut.close();  

            System.out.println("Done!");
            
            // Read in file to verify it
            Scanner fileIn = new Scanner(new File(starting, "/Step3/output.txt"));
            
            System.out.println("Reading from file ... ");
            while (fileIn.hasNext()) 
            {
                String lineIn = fileIn.nextLine(); 
                System.out.println(lineIn);
            }
            System.out.println("Done!");
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
