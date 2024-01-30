package Files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args)
    {

        // File object that is used to create new file
        File file  = new File("readme.txt");

        try
        {
            // Trying to create new file based on object
            boolean value = file.createNewFile();
            if(value)
            {
                System.out.println("File is created!");
            }

            // Writing to the file
            String data = "This is the data in the file";
            FileWriter output = new FileWriter("readme.txt");
            output.write(data);
            System.out.println("Data is written to file");
            output.close();

            // Reading from the file
            char[] array = new char[100];
            FileReader input = new FileReader("readme.txt");
            input.read(array);
            System.out.println("Data read from the file: ");
            System.out.println(array);
            input.close();

            // Deleting the file
            boolean check = file.delete();
            if(check)
            {
                System.out.println("File is deleted!");
            } 
        }
        catch(IOException e)
        {
            System.out.println("Exception: "+e);
        }

    }
}
